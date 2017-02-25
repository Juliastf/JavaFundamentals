package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by nikijul on 19.02.2017.
 */
public class Second {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        ArrayDeque<List<Integer>> tokens = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            List<Integer> line = new ArrayList<>();

            for (int j = 0; j < input.length; j++) {
                line.add(Integer.parseInt(input[j]));
            }
            tokens.add(line);

        }

        int count = 0;
        ArrayDeque<Integer> result = new ArrayDeque<>();

        while (!tokens.isEmpty()) {
            List<Integer> wave = tokens.poll();
            ArrayDeque<Integer> current = new ArrayDeque<>();
            for (int i = 0; i < wave.size(); i++) {
                int number=wave.get(i);
                current.add(number);
            }

            while (!current.isEmpty()) {
                if (current.size() == 1) {
                    count++;
                    result.add(current.poll());
                    break;
                }
                int seismisity = current.poll();
                if (seismisity >= current.peek()) {
                    current.poll();
                    current.addFirst(seismisity);

                } else if (seismisity < current.peek()) {
                        count++;
                        result.add(seismisity);
                    wave=new ArrayList<>();
                    for (Integer integer : current) {
                        wave.add(current.poll());
                    }
                    tokens.add(wave);
                    break;
                }
            }


        }
        System.out.println(count);

        for (Integer integer : result) {
            System.out.print(result.poll() + " ");

        }
    }
}
