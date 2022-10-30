package org.example;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Graph extends Application {
    static final int HEIGHT = 720;
    static final int WIDTH = 1080;

    public void start(Stage primaryStage) {
        Group group = new Group();

        int axisY = HEIGHT / 6;
        //Оси номограммы
        group.getChildren().addAll(
                //первая ось номограммы
                new Line(40, axisY, WIDTH - 40, axisY),
                new Text(10, axisY + 25, "f"),
                new Text(10, axisY - 20, "λ"),
                //вторая ось номограммы
                new Line(40, axisY * 2, WIDTH - 40, axisY * 2),
                new Text(10, axisY * 2 + 25, "f"),
                new Text(10, axisY * 2 - 20, "λ"),
                //третья ось номограммы
                new Line(40, axisY * 3, WIDTH - 40, axisY * 3),
                new Text(10, axisY * 3 + 25, "f"),
                new Text(10, axisY * 3 - 20, "λ"),
                //четвертая ось номограммы
                new Line(40, axisY * 4, WIDTH - 40, axisY * 4),
                new Text(10, axisY * 4 + 25, "f"),
                new Text(10, axisY * 4 - 20, "λ"),
                //пятая ось номограммы
                new Line(40, axisY * 5, WIDTH - 40, axisY * 5),
                new Text(10, axisY * 5 + 25, "f"),
                new Text(10, axisY * 5 - 20, "λ")
        );

        //первый промежуток 5 - 3 (2 цикла)
        for (int i = 0; i <= 40; i++) {
            Double pointX = 40 + (250.0 / 40) * i;
            int lineHeight = axisY + 5;
            if (i != 0 && i % 2 == 0) {
                lineHeight = axisY + 7;
            }
            if (i % 10 == 0) {
                lineHeight = axisY + 10;
                group.getChildren().add(
                        new Text(pointX - 10, axisY + 25, Double.toString(5 - (pointX - 40) / 125))
                );
            }
            group.getChildren().add(
                    new Line(pointX, axisY, pointX, lineHeight)
            );
        }

        for (int i = 0; i <= 40; i++) {
            Double pointX = 40 + 250.0 / 2 * (5 - 30.0 / (6 + i * 0.1));
            int lineHeight = axisY - 5;
            if (i % 5 == 0) {
                lineHeight = axisY - 10;
            }
            if (i % 10 == 0) {
                group.getChildren().add(
                        new Text(pointX - 10, axisY - 20, Double.toString(6 + i * 0.1))
                );
            }
            group.getChildren().add(
                    new Line(pointX, axisY, pointX, lineHeight)
            );
        }

        //второй промежуток 3 - 2 (2 цикла)
        for (int i = 0; i <= 20; i++) {
            Double pointX = 290 + (312.5 / 20) * i;
            int lineHeight = axisY + 5;
            if (i != 0 && i % 2 == 0) {
                lineHeight = axisY + 7;
            }
            if (i % 10 == 0) {
                lineHeight = axisY + 10;
                group.getChildren().add(
                        new Text(pointX - 10, axisY + 25, Double.toString(3 - (pointX - 290) / 312.5))
                );
            }
            group.getChildren().add(
                    new Line(pointX, axisY, pointX, lineHeight)
            );
        }

        for (int i = 0; i <= 25; i++) {
            Double pointX = 290 + 312.5 * (3 - 30 / (10 + i * 0.2));
            int lineHeight = axisY - 5;
            if (i != 0 && i % 5 == 0) {
                lineHeight = axisY - 10;
            }
            if (i != 0 && i % 25 == 0) {
                group.getChildren().add(
                        new Text(pointX - 10, axisY - 20, Double.toString(10 + i * 0.2))
                );
            }
            group.getChildren().add(
                    new Line(pointX, axisY, pointX, lineHeight)
            );
        }

        //3-й промежуток 2 - 1.5 (2 цикла)
        for (int i = 0; i <= 25; i++) {
            Double pointX = 602.5 + (175 / 25) * i;
            int lineHeight = axisY + 5;
            if (i != 0 && i % 5 == 0) {
                lineHeight = axisY + 7;
            }
            if (i != 0 && i % 25 == 0) {
                lineHeight = axisY + 10;
                group.getChildren().add(
                        new Text(pointX - 10, axisY + 25, Double.toString(1.5))
                );
            }
            group.getChildren().add(
                    new Line(pointX, axisY, pointX, lineHeight)
            );
        }

        for (int i = 0; i <= 25; i++) {
            Double pointX = 602.5 + 175 * 2 * (2 - 30 / (15 + i * 0.2));
            int lineHeight = axisY - 5;
            if (i != 0 && i % 5 == 0) {
                lineHeight = axisY - 10;
            }
            if (i != 0 && i % 25 == 0) {
                group.getChildren().add(
                        new Text(pointX - 10, axisY - 20, Double.toString(15 + i * 0.2))
                );
            }
            group.getChildren().add(
                    new Line(pointX, axisY, pointX, lineHeight)
            );
        }

        //3-й промежуток 1.5 - 1 (2 цикла)
        for (int i = 0; i <= 25; i++) {
            Double pointX = 777.5 + (262.5 / 25) * i;
            int lineHeight = axisY + 5;
            if (i != 0 && i % 5 == 0) {
                lineHeight = axisY + 7;
            }
            if (i != 0 && i % 25 == 0) {
                lineHeight = axisY + 10;
                group.getChildren().add(
                        new Text(pointX - 10, axisY + 25, Double.toString(1.0))
                );
            }
            group.getChildren().add(
                    new Line(pointX, axisY, pointX, lineHeight)
            );
        }

        for (int i = 0; i <= 20; i++) {
            Double pointX = 777.5 + 262.5 * 2 * (1.5 - 30 / (20 + i * 0.5));
            int lineHeight = axisY - 5;
            if (i != 0 && i % 2 == 0) {
                lineHeight = axisY - 10;
            }
            if (i != 0 && i % 10 == 0) {
                group.getChildren().add(
                        new Text(pointX - 10, axisY - 20, Double.toString(20 + i * 0.5))
                );
            }
            group.getChildren().add(
                    new Line(pointX, axisY, pointX, lineHeight)
            );
        }

        //
        for (int i = 0; i <= 50; i++) {
            Double pointX = 40 + 368.0 / 50 * i;
            int lineHeight = axisY * 2 + 5;
            if (i != 0 && i % 5 == 0) {
                lineHeight = axisY * 2 + 7;
            }
            if (i % 10 == 0) {
                lineHeight = axisY * 2 + 10;
            }
            if (i % 50 == 0) {
                group.getChildren().add(
                        new Text(pointX - 10, axisY * 2 + 25, Double.toString(15 - (pointX - 40) / (368.0 / 5)))
                );
            }
            group.getChildren().add(
                    new Line(pointX, axisY * 2, pointX, lineHeight)
            );
        }

        for (int i = 0; i <= 20; i++) {
            Double pointX = 40 + 368.0 / 5 * (15 - 30 / (2 + i * 0.05));
            int lineHeight = axisY * 2 - 5;
            if (i != 0 && i % 2 == 0) {
                lineHeight = axisY * 2 - 7;
            }
            if (i % 10 == 0) {
                lineHeight = axisY * 2 - 10;
                group.getChildren().add(
                        new Text(pointX - 10, axisY * 2 - 20, Double.toString(2 + i * 0.05))
                );
            }
            group.getChildren().add(
                    new Line(pointX, axisY * 2, pointX, lineHeight)
            );
        }

        //
        for (int i = 0; i <= 40; i++) {
            Double pointX = 408 + 470.0 / 40 * i;
            int lineHeight = axisY * 2 + 5;
            if (i != 0 && i % 5 == 0) {
                lineHeight = axisY * 2 + 7;
            }
            if (i % 10 == 0) {
                lineHeight = axisY * 2 + 10;
                group.getChildren().add(
                        new Text(pointX - 10, axisY * 2 + 25, Double.toString(10 - (pointX - 408) / (470.0 / 4)))
                );
            }
            group.getChildren().add(
                    new Line(pointX, axisY * 2, pointX, lineHeight)
            );
        }

        for (int i = 0; i <= 40; i++) {
            Double pointX = 408 + 470.0 / 4 * (10 - 30 / (3 + i * 0.05));
            int lineHeight = axisY * 2 - 5;
            if (i != 0 && i % 5 == 0) {
                lineHeight = axisY * 2 - 7;
            }
            if (i % 10 == 0) {
                lineHeight = axisY * 2 - 10;
                group.getChildren().add(
                        new Text(pointX - 10, axisY * 2 - 20, Double.toString(3 + i * 0.05))
                );
            }
            group.getChildren().add(
                    new Line(pointX, axisY * 2, pointX, lineHeight)
            );
        }

        //
        for (int i = 0; i <= 10; i++) {
            Double pointX = 878 + 162.0 / 10 * i;
            int lineHeight = axisY * 2 + 5;
            if (i != 0 && i % 5 == 0) {
                lineHeight = axisY * 2 + 7;
            }
            if (i % 10 == 0) {
                lineHeight = axisY * 2 + 10;
                group.getChildren().add(
                        new Text(pointX - 10, axisY * 2 + 25, Double.toString(6 - (pointX - 878) / 162.0))
                );
            }
            group.getChildren().add(
                    new Line(pointX, axisY * 2, pointX, lineHeight)
            );
        }

        for (int i = 0; i <= 20; i++) {
            Double pointX = 878 + 162.0 * (6 - 30 / (5 + i * 0.05));
            int lineHeight = axisY * 2 - 5;
            if (i != 0 && i % 2 == 0) {
                lineHeight = axisY * 2 - 7;
            }
            if (i % 10 == 0) {
                lineHeight = axisY * 2 - 10;
                group.getChildren().add(
                        new Text(pointX - 10, axisY * 2 - 20, Double.toString(5 + i * 0.05))
                );
            }
            group.getChildren().add(
                    new Line(pointX, axisY * 2, pointX, lineHeight)
            );
        }

        ////
        for (int i = 0; i <= 40; i++) {
            Double pointX = 40 + 430.0 / 40 * i;
            int lineHeight = axisY * 3 + 5;
            if (i != 0 && i % 2 == 0) {
                lineHeight = axisY * 3 + 7;
            }
            if (i % 10 == 0) {
                lineHeight = axisY * 3 + 10;
                group.getChildren().add(
                        new Text(pointX - 10, axisY * 3 + 25, Double.toString(50 - (pointX - 40) / (430.0 / 20)))
                );
            }
            group.getChildren().add(
                    new Line(pointX, axisY * 3, pointX, lineHeight)
            );
        }

        for (int i = 0; i <= 40; i++) {
            Double pointX = 40 + 430.0 / 20 * (50 - 30 / (0.6 + i * 0.01));
            int lineHeight = axisY * 3 - 5;
            if (i != 0 && i % 5 == 0) {
                lineHeight = axisY * 3 - 7;
            }

            if (i % 10 == 0) {
                lineHeight = axisY * 3 - 10;
                if (i == 30) {
                    group.getChildren().add(
                            new Text(pointX - 10, axisY * 3 - 20, Double.toString(0.9))
                    );
                } else {
                    group.getChildren().add(
                            new Text(pointX - 10, axisY * 3 - 20, Double.toString(0.6 + i * 0.01))
                    );
                }
            }
            group.getChildren().add(
                    new Line(pointX, axisY * 3, pointX, lineHeight)
            );
        }

        //
        for (int i = 0; i <= 20; i++) {
            Double pointX = 470 + 330.0 / 20 * i;
            int lineHeight = axisY * 3 + 5;
            if (i != 0 && i % 2 == 0) {
                lineHeight = axisY * 3 + 7;
            }
            if (i != 0 && i % 10 == 0) {
                lineHeight = axisY * 3 + 10;
                group.getChildren().add(
                        new Text(pointX - 10, axisY * 3 + 25, Double.toString(30 - (pointX - 470) / (330.0 / 10)))
                );
            }
            group.getChildren().add(
                    new Line(pointX, axisY * 3, pointX, lineHeight)
            );
        }

        for (int i = 0; i <= 50; i++) {
            Double pointX = 470 + 330.0 / 10 * (30 - 30 / (1 + i * 0.01));
            int lineHeight = axisY * 3 - 5;
            if (i != 0 && i % 5 == 0) {
                lineHeight = axisY * 3 - 7;
            }

            if (i % 50 == 0) {
                lineHeight = axisY * 3 - 10;
                group.getChildren().add(
                        new Text(pointX - 10, axisY * 3 - 20, Double.toString(1 + i * 0.01))
                );
            }
            group.getChildren().add(
                    new Line(pointX, axisY * 3, pointX, lineHeight)
            );
        }

        //
        for (int i = 0; i <= 25; i++) {
            Double pointX = 800 + 240.0 / 25 * i;
            int lineHeight = axisY * 3 + 5;
            if (i != 0 && i % 5 == 0) {
                lineHeight = axisY * 3 + 7;
            }
            if (i != 0 && i % 25 == 0) {
                lineHeight = axisY * 3 + 10;
                group.getChildren().add(
                        new Text(pointX - 10, axisY * 3 + 25, Double.toString(30 - (pointX - 800) / (240.0 / 5)))
                );
            }
            group.getChildren().add(
                    new Line(pointX, axisY * 3, pointX, lineHeight)
            );
        }

        for (int i = 0; i <= 25; i++) {
            Double pointX = 800 + 240.0 / 5 * (20 - 30 / (1.5 + i * 0.02));
            int lineHeight = axisY * 3 - 5;
            if (i != 0 && i % 5 == 0) {
                lineHeight = axisY * 3 - 7;
            }

            if (i % 25 == 0) {
                lineHeight = axisY * 3 - 10;
                group.getChildren().add(
                        new Text(pointX - 10, axisY * 3 - 20, Double.toString(1.5 + i * 0.02))
                );
            }
            group.getChildren().add(
                    new Line(pointX, axisY * 3, pointX, lineHeight)
            );
        }

        ////
        for (int i = 0; i <= 60; i++) {
            Double pointX = 40 + (800.0 / 60) * i;
            int lineHeight = axisY * 4 + 5;
            if (i != 0 && i % 5 == 0) {
                lineHeight = axisY * 4 + 10;
            }
            if (i % 10 == 0 && i != 10) {
                lineHeight = axisY * 4 + 12;
                group.getChildren().add(
                        new Text(pointX - 10, axisY * 4 + 25, Double.toString(120 - (pointX - 40) / (800.0 / 60)))
                );
            }
            group.getChildren().add(
                    new Line(pointX, axisY * 4, pointX, lineHeight)
            );
        }

        for (int i = 0; i <= 50; i++) {
            Double pointX = 40 + 800.0 / 60 * (120 - 30 / (0.25 + i * 0.005));
            int lineHeight = axisY * 4 - 5;
            if (i != 0 && i % 2 == 0) {
                lineHeight = axisY * 4 - 7;
            }

            if (i % 10 == 0) {
                lineHeight = axisY * 4 - 10;
                group.getChildren().add(
                        new Text(pointX - 10, axisY * 4 - 20, Double.toString(0.25 + i * 0.005))
                );
            }
            group.getChildren().add(
                    new Line(pointX, axisY * 4, pointX, lineHeight)
            );
        }

        //
        for (int i = 0; i <= 10; i++) {
            Double pointX = 840 + (200.0 / 10) * i;
            int lineHeight = axisY * 4 + 5;
            if (i != 0 && i % 5 == 0) {
                lineHeight = axisY * 4 + 10;
            }
            if (i % 10 == 0) {
                lineHeight = axisY * 4 + 12;
                group.getChildren().add(
                        new Text(pointX - 10, axisY * 4 + 25, Double.toString(60 - (pointX - 840) / (200.0 / 10)))
                );
            }
            group.getChildren().add(
                    new Line(pointX, axisY * 4, pointX, lineHeight)
            );
        }

        for (int i = 0; i <= 20; i++) {
            Double pointX = 840 + 200.0 / 10 * (60 - 30 / (0.5 + i * 0.005));
            int lineHeight = axisY * 4 - 5;
            if (i != 0 && i % 2 == 0) {
                lineHeight = axisY * 4 - 7;
            }

            if (i != 0 && i % 10 == 0) {
                lineHeight = axisY * 4 - 10;
                group.getChildren().add(
                        new Text(pointX - 10, axisY * 4 - 20, Double.toString(0.5 + i * 0.005))
                );
            }
            group.getChildren().add(
                    new Line(pointX, axisY * 4, pointX, lineHeight)
            );
        }
        ////
        for (int i = 0; i <= 20; i++) {
            Double pointX = 40 + (333.0 / 20) * i;
            int lineHeight = axisY * 5 + 5;
            if (i != 0 && i % 2 == 0) {
                lineHeight = axisY * 5 + 7;
            }
            if (i % 10 == 0) {
                lineHeight = axisY * 5 + 10;
                group.getChildren().add(
                        new Text(pointX - 10, axisY * 5 + 25, Double.toString(300 - (pointX - 40) / 3.33))
                );
            }
            group.getChildren().add(
                    new Line(pointX, axisY * 5, pointX, lineHeight)
            );
        }

        for (int i = 0; i <= 25; i++) {
            Double pointX = 40 + 333.0 / 100 * (300 - 30 / (0.1 + i * 0.002));
            int lineHeight = axisY * 5 - 5;
            if (i != 0 && i % 5 == 0) {
                lineHeight = axisY * 5 - 10;
            }

            if (i == 0) {
                lineHeight = axisY * 5 - 12;
                group.getChildren().add(
                        new Text(pointX - 10, axisY * 5 - 20, Double.toString(0.1 + i * 0.002))
                );
            } else if (i == 25) {
                group.getChildren().add(
                        new Text(pointX - 10, axisY * 5 - 20, Double.toString(0.15))
                );

            }
            group.getChildren().add(
                    new Line(pointX, axisY * 5, pointX, lineHeight)
            );
        }

        //
        for (int i = 0; i <= 25; i++) {
            Double pointX = 373 + (334.0 / 25) * i;
            int lineHeight = axisY * 5 + 5;
            if (i != 0 && i % 5 == 0) {
                lineHeight = axisY * 5 + 7;
            }
            if (i % 25 == 0) {
                lineHeight = axisY * 5 + 10;
                group.getChildren().add(
                        new Text(pointX - 10, axisY * 5 + 25, Double.toString(200 - (pointX - 373) / 6.68))
                );
            }
            group.getChildren().add(
                    new Line(pointX, axisY * 5, pointX, lineHeight)
            );
        }

        for (int i = 0; i <= 25; i++) {
            Double pointX = 373 + 334.0 / 50 * (200 - 30 / (0.15 + i * 0.002));
            int lineHeight = axisY * 5 - 5;
            if (i != 0 && i % 5 == 0) {
                lineHeight = axisY * 5 - 10;
            }

            if (i == 25) {
                group.getChildren().add(
                        new Text(pointX - 10, axisY * 5 - 20, Double.toString(0.20))
                );

            }
            group.getChildren().add(
                    new Line(pointX, axisY * 5, pointX, lineHeight)
            );
        }

        //
        for (int i = 0; i <= 30; i++) {
            Double pointX = 707 + (333.0 / 30) * i;
            int lineHeight = axisY * 5 + 5;
            if (i != 0 && i % 5 == 0) {
                lineHeight = axisY * 5 + 7;
            }
            if (i % 30 == 0) {
                lineHeight = axisY * 5 + 10;
                group.getChildren().add(
                        new Text(pointX - 10, axisY * 5 + 25, Double.toString(150 - (pointX - 707) / 11.1))
                );
            }
            group.getChildren().add(
                    new Line(pointX, axisY * 5, pointX, lineHeight)
            );
        }

        for (int i = 0; i <= 10; i++) {
            Double pointX = 707 + 333.0 / 30 * (150 - 30 / (0.2 + i * 0.005));
            int lineHeight = axisY * 5 - 5;
            if (i != 0 && i % 2 == 0) {
                lineHeight = axisY * 5 - 10;
            }

            if (i == 10) {
                group.getChildren().add(
                        new Text(pointX - 10, axisY * 5 - 20, Double.toString(0.25))
                );

            }
            group.getChildren().add(
                    new Line(pointX, axisY * 5, pointX, lineHeight)
            );
        }
        Scene scene = new Scene(group, WIDTH, HEIGHT);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}