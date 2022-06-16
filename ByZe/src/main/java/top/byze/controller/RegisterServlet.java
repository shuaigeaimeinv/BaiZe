package top.byze.controller;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author CodeXS
 */
@Slf4j
@WebServlet(value = "/register")
public class RegisterServlet extends HttpServlet {

    private void doException() {
        log.error("前端数据异常");
    }

    private void doWork(HttpServletRequest req, HttpServletResponse res) {
        String business = req.getParameter("business");
        if (business == null) {
            doException();
            return;
        }
        switch (business) {
            case Business.REGISTER:
                new top.byze.service.Register(req, res).register();
                break;
            case Business.CHECK_EMAIL:
                new top.byze.service.Register(req, res).checkEmail();
                break;
            case Business.SEND_VERIFICATION_CODE:
                new top.byze.service.Register(req, res).sendVerifyCode();
                break;
            case Business.LOGIN:
                new top.byze.service.Login(req, res).login();
                break;
            case Business.IS_LOGIN:
                new top.byze.service.Login(req, res).isLogin();
                break;
            default:
                log.error("前端数据异常");
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) {
        doWork(req, res);
    }

    /**
     * 业务类型
     */
    private static class Business {
        final static String CHECK_EMAIL = "101";
        final static String SEND_VERIFICATION_CODE = "102";
        final static String REGISTER = "103";
        final static String LOGIN = "104";
        final static String IS_LOGIN = "110";
    }

}
