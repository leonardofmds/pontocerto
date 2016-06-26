/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Util.Crypt;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.*;
import java.applet.*;
import java.security.*;
import java.util.ArrayList;
import java.util.Arrays;

public class MySQL_POST {
    
    public static void main(String r){
    HttpURLConnection conn=null;
    try{
    URL url=new URL("http://leonardomenezes.pe.hu/conn.php");
    String agent="Applet";
    String query="query=" + Crypt.encrypt(r);
    String type="application/x-www-form-urlencoded";
    conn=(HttpURLConnection)url.openConnection();
    conn.setDoInput(true);
    conn.setDoOutput(true);
    conn.setRequestMethod("POST");
    conn.setRequestProperty( "User-Agent", agent );
    conn.setRequestProperty( "Content-Type", type );
    conn.setRequestProperty( "Content-Length", ""+query.length());

    OutputStream out=conn.getOutputStream();
    out.write(query.getBytes());
    BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    String inputLine;
    while((inputLine=in.readLine())!=null){
        System.out.print(inputLine+"\n");
    };
    in.close();
    int rc = conn.getResponseCode();
    System.out.print("Response Code = "+rc+"\n");
    String rm=conn.getResponseMessage();
    System.out.print("Response Message = "+rm+"\n");
    }catch(Exception e){
    e.printStackTrace();
    }finally{
    conn.disconnect();
    }
    }
    
    public static DefaultListModel<String> carregaListaDiscModel(String qr)
    {
        DefaultListModel<String> lt = new DefaultListModel<>();
        HttpURLConnection conn=null;
        try{
        URL url=new URL("http://leonardomenezes.pe.hu/conn.php");
        String agent="Applet";
        String query="query=" + Crypt.encrypt(qr);
        String type="application/x-www-form-urlencoded";
        conn=(HttpURLConnection)url.openConnection();
        conn.setDoInput(true);
        conn.setDoOutput(true);
        conn.setRequestMethod("POST");
        conn.setRequestProperty( "User-Agent", agent );
        conn.setRequestProperty( "Content-Type", type );
        conn.setRequestProperty( "Content-Length", ""+query.length());

        OutputStream out=conn.getOutputStream();
        out.write(query.getBytes());
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String inputLine;
        boolean removeQry = false;
        while((inputLine=in.readLine())!=null){
            if(removeQry)
                //System.out.print(inputLine.replaceAll(" ", agent));
                lt.addElement(inputLine);
            removeQry = true;            
        };
        in.close();
        int rc = conn.getResponseCode();
        System.out.print("Response Code = "+rc+"\n");
        String rm=conn.getResponseMessage();
        System.out.print("Response Message = "+rm+"\n");
        }catch(Exception e){
        e.printStackTrace();
        }finally{
        conn.disconnect();
        }
        System.out.print(lt);
        return lt;
    }
    
    public static ArrayList carregaListaDisc(String qr)
    {
        ArrayList lt = new ArrayList();
        HttpURLConnection conn=null;
        try{
        URL url=new URL("http://leonardomenezes.pe.hu/conn.php");
        String agent="Applet";
        String query="query=" + Crypt.encrypt(qr);
        String type="application/x-www-form-urlencoded";
        conn=(HttpURLConnection)url.openConnection();
        conn.setDoInput(true);
        conn.setDoOutput(true);
        conn.setRequestMethod("POST");
        conn.setRequestProperty( "User-Agent", agent );
        conn.setRequestProperty( "Content-Type", type );
        conn.setRequestProperty( "Content-Length", ""+query.length());

        OutputStream out=conn.getOutputStream();
        out.write(query.getBytes());
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String inputLine;
        boolean removeQry = false;
        while((inputLine=in.readLine())!=null){
            if(removeQry)
                //System.out.print(inputLine.replaceAll(" ", agent));
                lt.add(inputLine);
            removeQry = true;            
        };
        in.close();
        int rc = conn.getResponseCode();
        System.out.print("Response Code = "+rc+"\n");
        String rm=conn.getResponseMessage();
        System.out.print("Response Message = "+rm+"\n");
        }catch(Exception e){
        e.printStackTrace();
        }finally{
        conn.disconnect();
        }
        //System.out.println(Arrays.toString(lt.getItems()));
        return lt;
    }
    

    }