/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.simpletelegrambot_bot;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Scanner;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

/**
 *
 * @author Ishi
 */
public class SimpleTelegramBot_bot extends TelegramLongPollingBot{


     public static void main(String[] args) {
        
        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new SimpleTelegramBot_bot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
     }
        @Override
    public void onUpdateReceived(Update update) {
        // TODO
         Scanner sc=new Scanner(System.in);
         System.out.println(update.getMessage().getText());
         String name=update.getMessage().getFrom().getFirstName();
         System.out.println(update.getMessage().getFrom().getFirstName());
         String command=update.getMessage().getText();
         if(command.equals("/start")){
              String message="click on your name\n /ansil \n/abhay \n/tanishka\n/madhu\n/golu";
             SendMessage response =new SendMessage();
             response.setChatId(update.getMessage().getChatId().toString());
             response.setText(message);
             
             try {
            execute(response);
            
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
         }
          if(command.equals("/1_month")){
              String message="Your 1 month plan is 249rs \n pay this bill and activate your Unlimited 1-month wifi\n /pay\n\n\n see 3_month plan";
             SendMessage response =new SendMessage();
             response.setChatId(update.getMessage().getChatId().toString());
             response.setText(message);
             
             try {
            execute(response);
            
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
         }
           if(command.equals("/3_month")){
              String message="Your 3 month plan is 599rs \n pay this bill and activate your Unlimited 3 month wifi\n /pay\n\n\n see /1_month plan";
             SendMessage response =new SendMessage();
             response.setChatId(update.getMessage().getChatId().toString());
             response.setText(message);
             
             try {
            execute(response);
            
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
         }
           
          if(command.equals("/pay")){
              String messageText = update.getMessage().getText();

              if (messageText.startsWith("/pay")) {
                SendPhoto photo = new SendPhoto();
                photo.setChatId(update.getMessage().getChatId());
                
                // create InputFile object from image URL
                String imageUrl = "C:\\Users\\Ishi\\Downloads\\c.png"; // replace with the URL of the image you want to send
                try {
                    URL url = new URL(imageUrl);
                    InputFile inputFile = new InputFile(url.openStream(), "image.jpg");
                    photo.setPhoto(inputFile);
                    execute(photo);
                } catch (IOException | TelegramApiException e) {
                    e.printStackTrace();
                }
            }
              String message="Enter your last 4 digit of URT number";
             SendMessage response =new SendMessage();
             response.setChatId(update.getMessage().getChatId().toString());
             response.setText(message);
             
             try {
            execute(response);
            
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
             int payment=sc.nextInt();
              message="you are Enter "+payment+" \n please wait, if your given detail is right then your wifi will be activated in few minutes";
             
             response.setChatId(update.getMessage().getChatId().toString());
             response.setText(message);
             
             try {
            execute(response);
            
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
             
         }
             
         if((command.equals("/ansil")&&name.equals("ansil123123"))||command.equals("/golu")||(command.equals("/abhay")&&name.equals("kumar"))||command.equals("/tanishka")||command.equals("/madhu")){
             
             String message="Choose your plan \n /1_month \n/3_month";
             SendMessage response =new SendMessage();
             response.setChatId(update.getMessage().getChatId().toString());
             response.setText(message);
             
             try {
            execute(response);
            
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
         
         
    }

    @Override
    public String getBotUsername() {
        // TODO
        return "ChutiyappaaaBot";
    }

    @Override
    public String getBotToken() {
        // TODO
        return "5410621487:AAGB5BNvaC6rU89uyTl4YH7fO8tiv9CwCNo";
    }
}
