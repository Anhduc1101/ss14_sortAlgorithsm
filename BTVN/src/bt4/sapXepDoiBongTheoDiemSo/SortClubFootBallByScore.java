package bt4.sapXepDoiBongTheoDiemSo;

import java.util.ArrayList;
import java.util.List;

public class SortClubFootBallByScore {
    static List<ClubFootBall> teams = new ArrayList<>();

    static {
        teams.add(new ClubFootBall(1, "ManCity", 23, 85));
        teams.add(new ClubFootBall(2, "ManU", 25, 73));
        teams.add(new ClubFootBall(3, "Arsenal", 30, 70));
        teams.add(new ClubFootBall(4, "Chelsea", 27, 75));
        teams.add(new ClubFootBall(5, "Liverpool", 33, 89));
    }

    public static void bubbleSort(List<ClubFootBall> teams) {
        for (int i = 0; i <teams.size()-1; i++) {
            for (int j = 0; j < teams.size()-1; j++) {
                if(teams.get(j).getScore()<teams.get(j+1).getScore()){
                    ClubFootBall temp=teams.get(j);
                    teams.set(j,teams.get(j+1));
                    teams.set(j+1,temp);
                }
            }
        }
    }
    public static void selectionSort(List<ClubFootBall> teams) {
        for (int i = 0; i < teams.size() - 1; i++) {
            ClubFootBall min = teams.get(i);
            int index = i;
            for (int j = i + 1; j < teams.size(); j++) {
                if (teams.get(j).getScore() > min.getScore()) {
                    min = teams.get(j);
                    index = j;
                }
            }
            if (index != i) {
                ClubFootBall temp = teams.get(i);
                teams.set(i, min);
                teams.set(index, temp);
            }
        }
    }

    public static void insertSort(List<ClubFootBall> teams){
        for (int i = 0; i < teams.size(); i++) {
            ClubFootBall currentTeam=teams.get(i);
            int j;
            for ( j = i-1; j >=0&&teams.get(j).getScore()<currentTeam.getScore() ; j--) {
                teams.set(j+1,teams.get(j));
            }
            teams.set(j+1,currentTeam);
        }
    }

    public static void main(String[] args) {
        for (ClubFootBall club:teams) {
            System.out.println(club.toString());
        }
//        bubbleSort(teams);
//        selectionSort(teams);
        insertSort(teams);
        System.out.println();
        System.out.println("\n"+teams.toString());

    }
}
