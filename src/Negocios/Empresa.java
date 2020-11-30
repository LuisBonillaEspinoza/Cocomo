/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import Conexion.DBManager;
import Entidad.clsEmpresa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author LUIS
 */
public class Empresa {
        Connection con = new DBManager().obtenerConexion();
    ResultSet rs;
    double a;
    double b;
    double c;
    double d;
    public void ObtenerDatos(int f){
        try {
            PreparedStatement pst = con.prepareStatement("select * from modo where modo_num_cod='" + f +"'");
            rs = pst.executeQuery();
            while(rs.next()){
                a = rs.getDouble("modo_do_a");
                b = rs.getDouble("modo_do_b");
                c = rs.getDouble("modo_do_c");
                d = rs.getDouble("modo_do_d");
            }
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Error al Obtener Valores : " + e.getMessage());
        }
    }
    
    public double Calculos1(double a,double b,double c,double d,double e,double f,double g,double h,double i,double j,double k,double m,double n,double o,double p,int q,double r){
        double es=0.0;
        double a1=0.0,b1=0.0,c1=0.0,d1=0.0;
        try {
            PreparedStatement pst = con.prepareStatement("select * from modo where modo_num_cod='" + r +"'");
            rs = pst.executeQuery();
            while(rs.next()){
                a1 = rs.getDouble("modo_do_a");
                b1 = rs.getDouble("modo_do_b");
                c1 = rs.getDouble("modo_do_c");
                d1 = rs.getDouble("modo_do_d");
            }
        } catch (Exception z) {
            System.out.println("Error al Obtener Valores : " + z.getMessage());
        }
       es = a1*(Math.pow(q,b1))*a*b*c*d*e*f*g*h*i*j*k*m*n*o*p;
       double ti = c1*(Math.pow(es,d1));
       double co = es*930;
        System.out.println(Math.pow(q,b1));
       return es;
    }
     public double Calculos2(double a,double b,double c,double d,double e,double f,double g,double h,double i,double j,double k,double m,double n,double o,double p,int q,double r){
        double es=0.0;
        double a1=0.0,b1=0.0,c1=0.0,d1=0.0;
        try {
            PreparedStatement pst = con.prepareStatement("select * from modo where modo_num_cod='" + r +"'");
            rs = pst.executeQuery();
            while(rs.next()){
                a1 = rs.getDouble("modo_do_a");
                b1 = rs.getDouble("modo_do_b");
                c1 = rs.getDouble("modo_do_c");
                d1 = rs.getDouble("modo_do_d");
            }
        } catch (Exception z) {
            System.out.println("Error al Obtener Valores : " + z.getMessage());
        }
       es = a1*(Math.pow(q,b1))*a*b*c*d*e*f*g*h*i*j*k*m*n*o*p;
       double ti = c1*(Math.pow(es,d1));
       return ti;
    }
      public double Calculos3(double a,double b,double c,double d,double e,double f,double g,double h,double i,double j,double k,double m,double n,double o,double p,int q,double r){
        double es=0.0;
        double a1=0.0,b1=0.0,c1=0.0,d1=0.0;
        try {
            PreparedStatement pst = con.prepareStatement("select * from modo where modo_num_cod='" + r +"'");
            rs = pst.executeQuery();
            while(rs.next()){
                a1 = rs.getDouble("modo_do_a");
                b1 = rs.getDouble("modo_do_b");
                c1 = rs.getDouble("modo_do_c");
                d1 = rs.getDouble("modo_do_d");
            }
        } catch (Exception z) {
            System.out.println("Error al Obtener Valores : " + z.getMessage());
        }
       es = a1*(Math.pow(q,b1))*a*b*c*d*e*f*g*h*i*j*k*m*n*o*p;
       double ti = c1*(Math.pow(es,d1));
       double co = es*930;
       return co;
    }
    public void Ingresar(clsEmpresa em){
         try {
            PreparedStatement pst=con.prepareStatement("insert into empresa(empresa_double_rely,empresa_double_data,empresa_double_cplx,empresa_double_time,empresa_double_stor,empresa_double_virt,empresa_double_turn,empresa_double_acap,empresa_double_aexp,empresa_double_pcap,empresa_double_vexp,empresa_double_lexp,empresa_double_modp,empresa_double_tool,empresa_double_sced,empresa_double_esfuerzo,empresa_double_tiempo,empresa_double_costo,modo_num_cod) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1,em.getEmpresa_double_rely());
            pst.setString(2,em.getEmpresa_double_data());
            pst.setString(3,em.getEmpresa_double_cplx());
            pst.setString(4, em.getEmpresa_double_time());
            pst.setString(5,em.getEmpresa_double_stor());
            pst.setString(6,em.getEmpresa_double_virt());
            pst.setString(7,em.getEmpresa_double_turn());
            pst.setString(8,em.getEmpresa_double_acap());
            pst.setString(9,em.getEmpresa_double_aexp());
            pst.setString(10,em.getEmpresa_double_pcap());
            pst.setString(11,em.getEmpresa_double_vexp());
            pst.setString(12,em.getEmpresa_double_lexp());
            pst.setString(13,em.getEmpresa_double_modp());
            pst.setString(14,em.getEmpresa_double_tool());
            pst.setString(15,em.getEmpresa_double_sced());
            pst.setString(16,em.getEmpresa_double_esfuerzo());
            pst.setString(17,em.getEmpresa_double_tiempo());
            pst.setString(18,em.getEmpresa_double_costo());
            pst.setString(19,em.getModo_num_cod());
            pst.executeUpdate();
        } catch (Exception e) {
             System.out.println("Error al Ingresar Datos : " + e.getMessage());
        }
    }
}
