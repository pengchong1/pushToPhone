package com.lanou.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import cn.jiguang.common.resp.APIConnectionException;
import cn.jiguang.common.resp.APIRequestException;
import cn.jpush.api.JPushClient;
import cn.jpush.api.push.model.PushPayload;

@WebServlet("/test")
public class TestServlet extends HttpServlet {

	int a = 0;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		this.doGet(req, res);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		System.out.println("=====name======" + req.getParameter("name"));
		System.out.println("=====pwd======" + req.getParameter("pwd"));
		String name = req.getParameter("name");
		String pwd = req.getParameter("pwd");
		String name1 = "pc";
		String pwd1 = "pc";
		HttpSession sesiion = req.getSession();

		if (name.equals(name1) && !pwd.equals(pwd1)){
			a = a + 1;
			sesiion.setAttribute("times", a);
			System.out.println("====aaaaaaa====="+sesiion.getAttribute("times"));
			 System.out.println("====111111111====="+sesiion.getAttribute("times"));
			if (sesiion.getAttribute("times").equals(3)) {
				JPushClient client = new JPushClient("9ad748607e2d4686e236c389", "3e3d6632c02cb8a645031ea9");
				PushPayload payload = PushPayload.alertAll("你好, 彭冲您的账户密码输入错误3次，请确认");
                    System.out.println("========="+sesiion.getAttribute("times"));
                    a=0;
        			sesiion.setAttribute("times", a);
				try {
					client.sendPush(payload);
				} catch (APIConnectionException e) {
					e.printStackTrace();
				} catch (APIRequestException e) {
					e.printStackTrace();
				}

			}

		} else {
			a=0;
			sesiion.setAttribute("times", a);

		}

		/*
		 * MS:9ad748607e2d4686e236c389 AK:3e3d6632c02cb8a645031ea9
		 */

	}

}
