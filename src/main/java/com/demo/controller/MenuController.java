package com.demo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.MenuItem;

public class MenuController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<MenuItem> menuItems = new ArrayList<>();
		MenuItem itemA = new MenuItem("Login", "/DemoWeb/ngui/login");
		MenuItem itemB = new MenuItem("Admin", "/DemoWeb/ngui/admin");
		menuItems.add(itemA);
		menuItems.add(itemB);

		req.setAttribute("menuItems", menuItems);
		RequestDispatcher disptcher = req.getRequestDispatcher("/index.jsp");
		disptcher.forward(req, resp);
	}
}
