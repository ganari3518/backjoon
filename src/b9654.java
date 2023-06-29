public class b9654 {
    public static void main(String[] args){
        String[][] str = {{"SHIP NAME", "CLASS", "DEPLOYMENT", "IN SERVICE"},
                {"N2 Bomber", "Heavy Fighter", "Limited", "21"},
                {"J-Type 327", "Light Combat", "Unlimited", "1"},
                {"NX Cruiser", "Medium Fighter", "Limited", "18"},
                {"N1 Starfighter", "Medium Fighter", "Unlimited", "25"},
                {"Royal Cruiser", "Light Combat", "Limited", "4"}};
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(str[i][j]);
                if(j == 0){
                    if(str[i][j].length() < 15){
                        for(int k = 0; k < 15 - str[i][j].length(); k++)
                            System.out.print(" ");
                    }
                } else if(j == 1){
                    if(str[i][j].length() < 15){
                        for(int k = 0; k < 15 - str[i][j].length(); k++)
                            System.out.print(" ");
                    }
                } else if(j == 2){
                    if(str[i][j].length() < 11){
                        for(int k = 0; k < 11 - str[i][j].length(); k++)
                            System.out.print(" ");
                    }
                } else{
                    if(str[i][j].length() < 10){
                        for(int k = 0; k < 10 - str[i][j].length(); k++)
                            System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
