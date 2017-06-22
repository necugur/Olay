/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

/**
 *
 * @author necdetozkan
 */
@ManagedBean(name="OlayManagedBean")
@RequestScoped
public class OlayManagedBean 
{
  
   private int id;
   private String name,unvan,kurum,posta,tarih,saat,atc,cagri,tescil,ilsid,localizer,gp,gpdme,marker,vorid,vor,vordme,ndbid,ndb,kule,kulefreq,app,appfreq,acc,accfreq,atis,atisfreq,gps,radar,detay;
   
           
            
    public OlayManagedBean() 
    {
    }

    public OlayManagedBean(int id, String name, String unvan, String kurum, String posta, String tarih, String saat, String atc, String cagri, String tescil, String ilsid, String localizer, String gp, String gpdme, String marker, String vorid, String vor, String vordme, String ndbid, String ndb, String kule, String kulefreq, String app, String appfreq, String acc, String accfreq, String atis, String atisfreq, String gps, String radar, String detay) {
        this.id = id;
        this.name = name;
        this.unvan = unvan;
        this.kurum = kurum;
        this.posta = posta;
        this.tarih = tarih;
        this.saat = saat;
        this.atc = atc;
        this.cagri = cagri;
        this.tescil = tescil;
        this.ilsid = ilsid;
        this.localizer = localizer;
        this.gp = gp;
        this.gpdme = gpdme;
        this.marker = marker;
        this.vorid = vorid;
        this.vor = vor;
        this.vordme = vordme;
        this.ndbid = ndbid;
        this.ndb = ndb;
        this.kule = kule;
        this.kulefreq = kulefreq;
        this.app = app;
        this.appfreq = appfreq;
        this.acc = acc;
        this.accfreq = accfreq;
        this.atis = atis;
        this.atisfreq = atisfreq;
        this.gps = gps;
        this.radar = radar;
        this.detay = detay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
     public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }
    
     public String getKurum() {
        return kurum;
    }

    public void setKurum(String kurum) {
        this.kurum = kurum;
    }
    
    public String getPosta() {
        return posta;
    }

    public void setPosta(String posta) {
        this.posta = posta;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getSaat() {
        return saat;
    }

    public void setSaat(String saat) {
        this.saat = saat;
    }

    public String getAtc() {
        return atc;
    }

    public void setAtc(String atc) {
        this.atc = atc;
    }

    public String getCagri() {
        return cagri;
    }

    public void setCagri(String cagri) {
        this.cagri = cagri;
    }

    public String getTescil() {
        return tescil;
    }

    public void setTescil(String tescil) {
        this.tescil = tescil;
    }

    public String getIlsid() {
        return ilsid;
    }

    public void setIlsid(String ilsid) {
        this.ilsid = ilsid;
    }

    public String getLocalizer() {
        return localizer;
    }

    public void setLocalizer(String localizer) {
        this.localizer = localizer;
    }

    public String getGp() {
        return gp;
    }

    public void setGp(String gp) {
        this.gp = gp;
    }

    public String getGpdme() {
        return gpdme;
    }

    public void setGpdme(String gpdme) {
        this.gpdme = gpdme;
    }

    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public String getVorid() {
        return vorid;
    }

    public void setVorid(String vorid) {
        this.vorid = vorid;
    }

    public String getVor() {
        return vor;
    }

    public void setVor(String vor) {
        this.vor = vor;
    }

    public String getVordme() {
        return vordme;
    }

    public void setVordme(String vordme) {
        this.vordme = vordme;
    }

    public String getNdbid() {
        return ndbid;
    }

    public void setNdbid(String ndbid) {
        this.ndbid = ndbid;
    }

    public String getNdb() {
        return ndb;
    }

    public void setNdb(String ndb) {
        this.ndb = ndb;
    }

    public String getKule() {
        return kule;
    }

    public void setKule(String kule) {
        this.kule = kule;
    }

    public String getKulefreq() {
        return kulefreq;
    }

    public void setKulefreq(String kulefreq) {
        this.kulefreq = kulefreq;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getAppfreq() {
        return appfreq;
    }

    public void setAppfreq(String appfreq) {
        this.appfreq = appfreq;
    }

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }

    public String getAccfreq() {
        return accfreq;
    }

    public void setAccfreq(String accfreq) {
        this.accfreq = accfreq;
    }

    public String getAtis() {
        return atis;
    }

    public void setAtis(String atis) {
        this.atis = atis;
    }

    public String getAtisfreq() {
        return atisfreq;
    }

    public void setAtisfreq(String atisfreq) {
        this.atisfreq = atisfreq;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public String getRadar() {
        return radar;
    }

    public void setRadar(String radar) {
        this.radar = radar;
    }

    public String getDetay() {
        return detay;
    }

    public void setDetay(String detay) {
        this.detay = detay;
    }

    
     
    public static Connection conn=null;
    public static PreparedStatement pstmt=null;
    public static ResultSet rs=null;
    private String str="";
    
        
    
    public static Connection getConnection()
    {
       try {
           Class.forName("com.mysql.jdbc.Driver");
           
    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/deneme","root","necugur");
           
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(OlayManagedBean.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
           Logger.getLogger(OlayManagedBean.class.getName()).log(Level.SEVERE, null, ex);
       }
       return conn;
    }
    public static void closeAll(Connection conn, PreparedStatement pstmt,ResultSet rs)
    {
        if (conn!=null)  {
            try
            {
                conn.close();
        } catch (SQLException ex) 
        {
            Logger.getLogger(OlayManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
         if (pstmt!=null)  {
            try
            {
                pstmt.close();
        } catch (SQLException ex) 
        {
            Logger.getLogger(OlayManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
          if (rs!=null)  {
            try
            {
                rs.close();
        } catch (SQLException ex) 
        {
            Logger.getLogger(OlayManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
}  
//   public static void main(String[] args) {
//        
//        System.out.println(getConnection());
    
    

//    }
    
 
    
    
    public ArrayList<OlayManagedBean> GetAllReport()
    {
        
    
        
    ArrayList<OlayManagedBean> arr=new ArrayList<>();
    str="SELECT id,name,unvan,kurum,posta,tarih,saat,atc,cagri,tescil,ilsid,localizer,gp,gpdme,marker,vorid,vor,vordme,ndbid,ndb,kule,kulefreq,app,appfreq,acc,accfreq,atis,atisfreq,gps,radar,detay FROM raporlar";
    getConnection();
       try {
          pstmt=conn.prepareStatement(str);
          rs= pstmt.executeQuery();
          while(rs.next())
          {
            OlayManagedBean st=new OlayManagedBean();
            st.setId(rs.getInt("id"));
            st.setName(rs.getString("name"));
            st.setUnvan(rs.getString("unvan"));
            st.setKurum(rs.getString("kurum"));
            st.setPosta(rs.getString("posta"));
            st.setTarih(rs.getString("tarih"));
            st.setSaat(rs.getString("saat"));
            st.setAtc(rs.getString("atc"));
            st.setCagri(rs.getString("cagri"));
            st.setTescil(rs.getString("tescil"));
            st.setIlsid(rs.getString("ilsid"));
            st.setLocalizer(rs.getString("localizer"));
            st.setGp(rs.getString("gp"));
            st.setGpdme(rs.getString("gpdme"));
            st.setMarker(rs.getString("marker"));
            st.setVorid(rs.getString("vorid"));
            st.setVor(rs.getString("vor"));
            st.setVordme(rs.getString("vordme"));
            st.setNdbid(rs.getString("ndbid"));
            st.setNdb(rs.getString("ndb"));
            st.setKule(rs.getString("kule"));
            st.setKulefreq(rs.getString("kulefreq"));
            st.setApp(rs.getString("app"));
            st.setAppfreq(rs.getString("appfreq"));
            st.setAcc(rs.getString("acc"));
            st.setAccfreq(rs.getString("accfreq"));
            st.setAtis(rs.getString("atis"));
            st.setAtisfreq(rs.getString("atisfreq"));
            st.setGps(rs.getString("gps"));
            st.setRadar(rs.getString("radar"));
            st.setDetay(rs.getString("detay"));
            
            arr.add(st);
            
            
          }
       } catch (SQLException ex) {
           Logger.getLogger(OlayManagedBean.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    finally
    {
        closeAll(conn,pstmt,rs);
    }
    
    return arr;
    }
    
    
    
    public void select()
    {
        int idReport;
        ArrayList<OlayManagedBean> arrList=GetAllReport();
        FacesContext fc=FacesContext.getCurrentInstance();
        
        HttpServletRequest request=(HttpServletRequest) fc.getExternalContext().getRequest();
        idReport=Integer.parseInt(request.getParameter("id"));
        
        
        for (OlayManagedBean olayManagedBean : arrList)
        {
            if(olayManagedBean.getId()== idReport)
            {
                this.setId(olayManagedBean.getId());
                this.setName(olayManagedBean.getName());
                this.setUnvan(olayManagedBean.getUnvan());
                this.setKurum(olayManagedBean.getKurum());
                this.setTarih(olayManagedBean.getTarih());
                this.setSaat(olayManagedBean.getSaat());
                this.setAtc(olayManagedBean.getAtc());
                this.setCagri(olayManagedBean.getCagri());
                this.setTescil(olayManagedBean.getTescil());
                this.setIlsid(olayManagedBean.getIlsid());
                this.setLocalizer(olayManagedBean.getLocalizer());
                this.setGp(olayManagedBean.getGp());
                this.setGpdme(olayManagedBean.getGpdme());
                this.setMarker(olayManagedBean.getMarker());
                this.setNdbid(olayManagedBean.getNdbid());
                this.setNdb(olayManagedBean.getNdb());
                this.setKule(olayManagedBean.getKule());
                this.setKulefreq(olayManagedBean.getKulefreq());
                this.setApp(olayManagedBean.getApp());
                this.setAppfreq(olayManagedBean.getAppfreq());
                this.setAcc(olayManagedBean.getAcc());
                this.setAccfreq(olayManagedBean.getAccfreq());
                this.setAtis(olayManagedBean.getAtis());
                this.setAtisfreq(olayManagedBean.getAtisfreq());
                this.setRadar(olayManagedBean.getRadar());
                this.setGps(olayManagedBean.getGps());
                this.setDetay(olayManagedBean.getDetay());
                
            }
            
        }
            
            
            
    }   
         
       
    


public void add()
{
getConnection();
str="insert into raporlar(name,unvan,kurum,posta,tarih,saat,atc,cagri,tescil,ilsid,localizer,gp,gpdme,marker,vorid,vor,vordme,ndbid,ndb,kule,kulefreq,app,appfreq,acc,accfreq,atis,atisfreq,radar,gps,detay) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
try
{
    pstmt=conn.prepareStatement(str);
    pstmt.setString(1, this.getName());
    pstmt.setString(2, this.getUnvan());
    pstmt.setString(3, this.getKurum());
    pstmt.setString(4, this.getPosta());
    pstmt.setString(5, this.getTarih());
    pstmt.setString(6, this.getSaat());
    pstmt.setString(7, this.getAtc());
    pstmt.setString(8, this.getCagri());
    pstmt.setString(9, this.getTescil());
    pstmt.setString(10, this.getIlsid());
    pstmt.setString(11, this.getLocalizer());
    pstmt.setString(12, this.getGp());
    pstmt.setString(13, this.getGpdme());
    pstmt.setString(14, this.getMarker());
    pstmt.setString(15, this.getVorid());
    pstmt.setString(16, this.getVor());
    pstmt.setString(17, this.getVordme());
    pstmt.setString(18, this.getNdbid());
    pstmt.setString(19, this.getNdb());
    pstmt.setString(20, this.getKule());
    pstmt.setString(21, this.getKulefreq());
    pstmt.setString(22, this.getApp());
    pstmt.setString(23, this.getAppfreq());
    pstmt.setString(24, this.getAcc());
    pstmt.setString(25, this.getAccfreq());
    pstmt.setString(26, this.getAtis());
    pstmt.setString(27, this.getAtisfreq());
    pstmt.setString(28, this.getRadar());
    pstmt.setString(29, this.getGps());
    pstmt.setString(30, this.getDetay());
   
    

    int executeUpdate = pstmt.executeUpdate();
    if(executeUpdate>0)
    {
        System.out.println("Update Successfully");
    }
}
    
    catch (SQLException ex)
        
    {
        Logger.getLogger(OlayManagedBean.class.getName()).log(Level.SEVERE, null, ex);
   
    }

    finally{closeAll(conn, pstmt, rs);}

}
}

        
        
        



    





    

