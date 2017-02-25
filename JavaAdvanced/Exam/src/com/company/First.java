package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 * Created by nikijul on 19.02.2017.
 */
public class First {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String[] size=reader.readLine().split(" ");
        int rows=Integer.parseInt(size[0]);
        int cols=Integer.parseInt(size[1]);

        Integer[][] room=new Integer[rows][cols];

        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <cols ; j++) {
                room[i][j]=0;

            }
        }

        String input=reader.readLine();

        while (!"Here We Go".equals(input)){
            String[] points=input.split(" ");
            int x1=Integer.parseInt(points[0]);
            int y1=Integer.parseInt(points[1]);
            int x2=Integer.parseInt(points[2]);
            int y2=Integer.parseInt(points[3]);

            for (int i = x1; i <=x2; i++) {
                for (int j = y1; j <=y2; j++) {
                    room[i][j]+=1;

                }

            }

            input=reader.readLine();
        }

        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j < cols   ; j++) {
                System.out.print(room[i][j]+" ");

            }
            System.out.println();

        }

    }
}
