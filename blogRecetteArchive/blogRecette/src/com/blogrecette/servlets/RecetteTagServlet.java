package com.blogrecette.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.blogrecette.model.*;
import com.blogrecette.services.*;

/**
 * Servlet implementation class Recette
 */
@WebServlet(name = "recette-tag", urlPatterns = {"/recette-tag"})
public class RecetteTagServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecetteTagServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int tagId = Integer.parseInt(request.getParameter("tag"));
        int recetteId = Integer.parseInt(request.getParameter("recetteId"));

        RecetteService rs = new RecetteService();

        TagService ts = new TagService();
        Tag tag = null;
        Recette recette = null;


        try {
            recette = rs.getRecetteFromId(recetteId);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            tag = ts.getTagById(tagId);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            rs.addTag(tag, recette);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // rs.updateRecette(recette);

        response.sendRedirect("/recette?id="+recetteId);

    }

}
