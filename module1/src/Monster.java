import java.util.Random;
import java.util.Scanner;

public class Monster {
    private String image = "\uD83E\uDDDF";
    private final int x, y;

    Monster(int sizeBoard) {
        Random random = new Random();
        x = 1 + random.nextInt(sizeBoard);
        y = 1 + random.nextInt(sizeBoard - 1);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean conflictPerson(int personX, int personY) {
        return personX == x && personY == y;
    }

    public boolean taskMonster(int difficultGame) {
        System.out.println("Решите задачу:");

        if (difficultGame == 1) {
            Random random = new Random();
            int a = random.nextInt(10);
            int b = random.nextInt(10);
            int trueAnswer = a + b;

            System.out.println("Реши пример: " + a + " + " + b + " = ?");
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();

            if (trueAnswer == answer) {
                System.out.println("Верно! Ты победил монстра");
                return true;
            } else {
                System.out.println("Ты проиграл эту битву!");
                return false;
            }
        } else {
            if (difficultGame == 2) {
                Random random = new Random();
                int a = random.nextInt(100);
                int b = random.nextInt(100);
                int trueAnswer = a + b;

                System.out.println("Реши пример: " + a + " + " + b + " = ?");
                Scanner scanner = new Scanner(System.in);
                int answer = scanner.nextInt();

                if (trueAnswer == answer) {
                    System.out.println("Верно! Ты победил монстра");
                    return true;
                } else {
                    System.out.println("Ты проиграл эту битву!");
                    return false;
                }
            } else {
                if (difficultGame == 3) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Ответьте на вопрос: " + "\nСколько существует городов-героев?");
                    int answer = scanner.nextInt();
                    int trueAnswer = 12;
                    if (trueAnswer == answer) {
                        System.out.println("Верно! Ты победил монстра");
                        return true;
                    } else {
                        System.out.println("Ты проиграл эту битву!");
                        return false;
                    }
                } else {
                    if (difficultGame == 4) {
                        Random random = new Random();
                        int a = random.nextInt(150);
                        int b = random.nextInt(150);
                        int trueAnswer = a * b;

                        System.out.println("Реши пример: " + a + " * " + b + " = ?");
                        Scanner scanner = new Scanner(System.in);
                        int answer = scanner.nextInt();

                        if (trueAnswer == answer) {
                            System.out.println("Верно! Ты победил монстра");
                            return true;
                        } else {
                            System.out.println("Ты проиграл эту битву!");
                            return false;
                        }
                    } else {
                        if (difficultGame == 5) {
                            Random random = new Random();
                            int min = 25000;
                            int max = 40000;
                            int D = random.nextInt(min, max + 1);
                            int I = 16;
                            int n = 2;
                            int t = random.nextInt(200);
                            int trueAnswer = (D * I * n * t) / (8 * 1024);
                            System.out.println("Лена записывает голосовое сообщение для своей подруги. Перед отправкой сообщение оцифровывается в формате стерео с частотой дискретизации " + D + " Гц и глубиной кодирования " + I + " бит. Определите наименьшее целое количество Кбайт, необходимое для сохранения сообщения в памяти (без учета заголовка), если его длительность - " + t + " секунд. В ответе укажите только целое число."
                                    + "\nФормула для решения задачи: "
                                    + "\nV = D * I * n * t, где V - объем файла, D - частота дискретизации, I - глубина кодирования, n - количество каналов, t - длина сообщения в секундах");

                            Scanner scanner = new Scanner(System.in);
                            int answer = scanner.nextInt();

                            if (trueAnswer == answer) {
                                System.out.println("Верно! Ты победил монстра");
                                return true;
                            } else {
                                System.out.println("Ты проиграл эту битву!");
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}