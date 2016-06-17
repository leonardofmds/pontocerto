package Util;

import java.io.InputStream;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;
import javax.swing.JOptionPane;

/**
* Classe para enviar email em anexo usando o Gmail.
*
* @author jabes.cunha
*
*/
public class Mail {    

       public static void main() {            
            new Mail();
	}
       
       public static void denuncia(String mensagem){           
            try {
                        //usuario e senha do seu gmail
			final String usuario = "pontocerto.unitec@gmail.com";
			final String senha = "leogabru";
                        
                        

			//config. do gmail
			Properties mailProps = new Properties();
			mailProps.put("mail.transport.protocol", "smtp");
			mailProps.put("mail.smtp.starttls.enable","true");
			mailProps.put("mail.smtp.host", "smtp.gmail.com");
			mailProps.put("mail.smtp.auth", "true");
			mailProps.put("mail.smtp.user", usuario);
		  	mailProps.put("mail.debug", "true");
			mailProps.put("mail.smtp.port", "465");
			mailProps.put("mail.smtp.socketFactory.port", "465");
			mailProps.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			mailProps.put("mail.smtp.socketFactory.fallback", "false");

			//eh necessario autenticar
			Session mailSession = Session.getInstance(mailProps, new Authenticator() {					
				public PasswordAuthentication getPasswordAuthentication(){				
					return new PasswordAuthentication(usuario, senha);
				}
			});
			mailSession.setDebug(false);

			//config. da mensagem
			Message mailMessage = new MimeMessage(mailSession);

			//remetente
			mailMessage.setFrom(new InternetAddress(usuario));

			//destinatario
			mailMessage.setRecipients(Message.RecipientType.TO, 			InternetAddress.parse(usuario));		

			//mensagem que vai no corpo do email
			MimeBodyPart mbpMensagem = new MimeBodyPart();
			mbpMensagem.setText(mensagem);

			//partes do email
			Multipart mp = new MimeMultipart();
			mp.addBodyPart(mbpMensagem);                      

			
			//assunto do email
			mailMessage.setSubject("Denuncia do arquivo: " + " Disciplina: ");
			
			//seleciona o conteudo
			mailMessage.setContent(mp);

			//envia o email
			Transport.send(mailMessage);                        
                        
		} catch (Exception e) {
			e.printStackTrace();
		}
       }

	public static void enviar(String disciplina, String tipo, String subtipo, String ano, String semestre, FileDataSource fds) {
                    
		try {

			//usuario e senha do seu gmail
			final String usuario = "pontocerto.unitec@gmail.com";
			final String senha = "leogabru";

			//config. do gmail
			Properties mailProps = new Properties();
			mailProps.put("mail.transport.protocol", "smtp");
			mailProps.put("mail.smtp.starttls.enable","true");
			mailProps.put("mail.smtp.host", "smtp.gmail.com");
			mailProps.put("mail.smtp.auth", "true");
			mailProps.put("mail.smtp.user", usuario);
		  	mailProps.put("mail.debug", "true");
			mailProps.put("mail.smtp.port", "465");
			mailProps.put("mail.smtp.socketFactory.port", "465");
			mailProps.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			mailProps.put("mail.smtp.socketFactory.fallback", "false");

			//eh necessario autenticar
			Session mailSession = Session.getInstance(mailProps, new Authenticator() {					
				public PasswordAuthentication getPasswordAuthentication(){				
					return new PasswordAuthentication(usuario, senha);
				}
			});
			mailSession.setDebug(false);

			//config. da mensagem
			Message mailMessage = new MimeMessage(mailSession);

			//remetente
			mailMessage.setFrom(new InternetAddress(usuario));

			//destinatario
			mailMessage.setRecipients(Message.RecipientType.TO, 			InternetAddress.parse(usuario));		

			//mensagem que vai no corpo do email
			MimeBodyPart mbpMensagem = new MimeBodyPart();
			mbpMensagem.setText("Segue em anexo: \n" + tipo + " " + subtipo + "\nAno: " + ano + " Semestre: " + semestre);

			//partes do email
			Multipart mp = new MimeMultipart();
			mp.addBodyPart(mbpMensagem);
			
                       // String imagem = "";
                       // InputStream is = getClass().getResourceAsStream(imagem);

			//setando o anexo
			MimeBodyPart mbpAnexo = new MimeBodyPart();
			mbpAnexo.setDataHandler(new DataHandler(fds));		
			mbpAnexo.setFileName(fds.getName());
			mp.addBodyPart(mbpAnexo);

			//assunto do email
			mailMessage.setSubject(disciplina);
			
			//seleciona o conteudo
			mailMessage.setContent(mp);

			//envia o email
			Transport.send(mailMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}