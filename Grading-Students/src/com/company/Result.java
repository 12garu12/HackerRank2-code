package com.company;

import java.io.*;
import java.lang.annotation.ElementType;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Result {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        int[] roundGrade = {40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100};
        for (Integer grade : grades) {
            if(grade >= 38){
                for (int i = 0 ; i < roundGrade.length ; i++) {
                    if (roundGrade[i] > grade &&  Math.abs(roundGrade[i] - grade) < 3){
                        grades.set(grades.indexOf(grade), roundGrade[i]);
                        break;
                    }
                }
            }
        }
        return grades;
    }

    public static void main(String[] args) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.gradingStudents(grades);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();

    }
}
