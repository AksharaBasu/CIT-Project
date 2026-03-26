public class SwitchCase {
    public static void main(String[] args) {
        int day = 5;
        switch(day){
            case 1:
                System.err.println("Monday");
                break;
                case 2:
                    System.err.println("Tuesday");
                    break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                        case 4:
                            System.out.println("Thusday");
                            break;
                            case 5:
                                System.out.println("Friday");
                                break;
                                case 6:
                                    System.out.println("Saturday");
                                    break;
                                    case 7:
                                        System.out.println("Sunday");
                                        break;
            default:
                System.out.println("invalid day ");
        }

    }
    
}
