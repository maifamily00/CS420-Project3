/**
 * Created by Loc Mai on 3/4/2017.
 */
public class Ai {
    public Ai(){

    }

//    public int[][] makeMove(){
//        maxVal(state, alpha, beta);
//    }

//    public int maxVal(int[][] state, int alpha, int beta){
//        int nAlpha = alpha;
//        int nBeta = beta;
//        if(checkForWinner() != 0){
//            return checkForWinner();
//        }
//        int v = -100000;
//        for(int i = 0; i < state.length; i++) {
//            for (int j = 0; j < state[i].length; j++) {
//                v = Math.max(v, minVal(nState, nAlpha, nBeta));
//                if(v >= beta){
//                    return v;
//                }
//                nAlpha = Math.max(alpha, v);
//            }
//        }
//        return v;
//    }
//
//    public int minVal(int[][] state, int alpha, int beta){
//        int nAlpha = alpha;
//        int nBeta = beta;
//        if(checkForWinner != 0){
//            return checkForWinner();
//        }
//        int v = 100000;
//        for(int i = 0; i < state.length; i++){
//            for(int j = 0; j < state[i].length; j++){
//                v = Math.min(v, maxVal(nState, nAlpha, nBeta));
//                if(v <= alpha){
//                    return v;
//                }
//                nBeta = Math.min(beta, v);
//            }
//        }
//        return v;
//    }
}
