package com.example.daawproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }


    /*
     * Controllers https api call extern sources
     * Services link between controllers and repositories, and contains all the business logic
     *  -> uses models
     * repositories stores and reads data only and all crud ops -> uses entities
     */


    /*
        http request :
        headers: explanation of the type of request and body (meta data)
        body: the content of the request

        http response :
        headers: explanation of the type of request and body (meta data)
        body: the content of the response


    What is rest api what most people think it is
       GET https://helloworld.com/getData
        response =>

        header: content-type => application/json
            {
            "data":{
                "message":"Hello world!"
                }
            }




    The real definition of resteful api:
         https://ecommerce/users/root
            {
            "endpoints":{
                "read":{
                    "method":"get"
                    "href:"https://ecommerce/users"
                },
                 "create":{
                    "method":"post"
                    "href:"https://ecommerce/users"
                }
            }

            GET href: https://ecommerce/users
            {
            "users":[
                    {
                    "id":"1",
                    "read":{
                        href:"https://ecommerce/users/1"
                        method:"get"
                    }
                    ....
                ]
            }

            GET href:"https://ecommerce/users/1:
            {
                "data:{
                    "name":"hocine"
                }
                "endpoints":{
                    "delete":{
                        "method":"delete"
                        "href:"https://ecommerce/users"
                    },
                    "update":{
                        "method":"put"
                        "href:"https://ecommerce/users/"
                    }
             }
     */

}
