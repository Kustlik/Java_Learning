package Zadanie4;

import java.text.Format;

public class App {

    public static void main(String[] args) {
        double progress = 0.0;
        boolean slash = false;

        do {
            StringBuilder sb = new StringBuilder();
            StringBuilder progressBuilder = new StringBuilder();
            int progressBar = (int)(progress / 10);
            sb.append("Wczytywanie");
            if (slash)
                sb.append(" / ");
            else
                sb.append(" \\ ");
            sb.append("%6.2f%% (");
            sb.append("%-10s");
            for (int i = 0; i < progressBar; i++)
                progressBuilder.append("#");
            sb.append(")\r");
            System.out.printf(sb.toString(), progress, progressBuilder.toString());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            progress += 0.50;
            slash = !slash;
        }while(progress <= 100);
        System.out.println("Wczytywanie zakończono");
    }
}
