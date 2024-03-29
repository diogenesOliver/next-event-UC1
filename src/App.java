import controller.CreateUserController;
import controller.CreateEventController;
import controller.GetEventsController;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        CreateUserController creatUserControler = new CreateUserController();
        CreateEventController createEventController = new CreateEventController();
        GetEventsController getEventsController = new GetEventsController();

        Scanner menu = new Scanner(System.in);

        while (true) {

            System.out.print("##-- Next Events Menu --##\n\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("| Opção 1 - Novo Usuário      |\n");
            System.out.print("| Opção 2 - Novo Evento       |\n");
            System.out.print("| Opção 3 - Listar Eventos    |\n");
            System.out.print("| Opção 4 - Sair              |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("Digite uma opção: ");

            int opcao = menu.nextInt();

            if (opcao == 4) {
                System.out.print("\nAté logo!");
                menu.close();
            }

            switch (opcao) {
                case 1:
                    creatUserControler.createUser();
                    break;

                case 2:
                    createEventController.createEvent();
                    break;

                case 3:
                    getEventsController.getEvents();
                    break;

                default:
                    System.out.print("\nOpção Inválida!");
                    break;
            }

        }
    }
}