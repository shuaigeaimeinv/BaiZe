package top.byze.utils;

import top.byze.bean.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SessionUtil {

    // 设置session
    public static void set(User user, HttpServletRequest req) {
        req.getSession().setAttribute("user", user);
    }

    // 获得session中的用户
    public static User getUser(HttpServletRequest req) {
        HttpSession session = req.getSession();
        return ((User) session.getAttribute("user"));
    }

    //删除session
    public static void delete(HttpServletRequest req) {
        HttpSession session = req.getSession();
        session.getId();
    }

}
