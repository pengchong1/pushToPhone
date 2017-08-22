package com.lanou.test.tr;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.jiguang.common.resp.APIConnectionException;
import cn.jiguang.common.resp.APIRequestException;
import cn.jpush.api.JPushClient;
import cn.jpush.api.push.model.PushPayload;

public class TestJpush extends HttpServlet {
	/*@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, res);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		JPushClient client = new JPushClient("9ad748607e2d4686e236c389", "3e3d6632c02cb8a645031ea9");
		PushPayload payload = PushPayload.alertAll("你好，混应回来");

		try {
			client.sendPush(payload);
		} catch (APIConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (APIRequestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		 * MS:9ad748607e2d4686e236c389 AK:3e3d6632c02cb8a645031ea9
		 

	}*/

}
