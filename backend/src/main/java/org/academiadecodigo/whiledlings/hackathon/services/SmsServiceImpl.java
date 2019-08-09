package org.academiadecodigo.whiledlings.hackathon.services;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

@Service
public class SmsServiceImpl implements SmsService{

    @Override
    public void sendSms(String phone) {
        try {
            URL url = new URL("https://www.mysms.pt/api/enviar_sms_get.php?username=ruidpm" +
                    "&password=Hacka2019*&origem=912780128&destino=" + phone +
                    "&mensagem=A sua mensagem foi recebida. A equipa reConnect&mensagemlonga=0&tipo=normal)");

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
