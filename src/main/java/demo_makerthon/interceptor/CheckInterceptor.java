package demo_makerthon.interceptor;

import demo_makerthon.mapper.UtilsMapper;
import demo_makerthon.pojo.Result;
import demo_makerthon.service.UtilsService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;

@Slf4j
@Component
public class CheckInterceptor implements HandlerInterceptor {
    @Autowired
    UtilsMapper utilsMapper;
    @Autowired
    UtilsService utilsService;

    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object handler) throws Exception {
        System.out.println("攔截器已啟用");
        String url = req.getRequestURI().toString();
        log.info("請求的url:{}",url);

        if(false){
            log.info("前端操作, 放行");
            return true;
        }else{
            //黑盒子
            String ipAddress = req.getRemoteAddr();
            if(utilsMapper.checkIp(ipAddress) == null){
                utilsMapper.setDevice(utilsService.getHashName(), ipAddress);
            }else{
                utilsMapper.setDeviceTime(ipAddress, LocalDateTime.now());
            }
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        //HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
        System.out.println("postHandle!");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        //HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
        System.out.println("afterCompletion!");

        String ipAddress = request.getRemoteAddr();
        utilsMapper.setDeviceTime(ipAddress, LocalDateTime.now());
    }
}
