package web;

import hibernate.dao.HibernateDAO;
import hibernate.dao.HibernateDAOImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import metier.Vol;

import java.io.IOException;

@WebServlet(name = "save", value = "/save")
public class save extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HibernateDAO hibernateDAO = new HibernateDAOImpl();
        String Duree = request.getParameter("Duree");
        String HeureDepart = request.getParameter("HeureDepart");
        String HeureArrive = request.getParameter("HeureArrive");
        String VilleDepart = request.getParameter("VilleDepart");
        String VilleArrive = request.getParameter("VilleArrive");
        Vol vol = new Vol(null, Duree, HeureDepart, HeureArrive, VilleDepart, VilleArrive);
        try {
            hibernateDAO.save(vol);
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        System.out.println("e/////////////////////////:");
    }
}