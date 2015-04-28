/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import game.BSBlock;
import game.BSPosition;
import game.BSShip;
import game.Game;
import game.GameState;
import game.Ship;
import java.util.ArrayList;
package game;

/**
 *
 * @author huangzhen
 */
public class BSGame implements Game<BSBlock, BSShip>{
   
    public void SetMap(ArrayList<Integer> RoomSetting) throws Exception{
        int i,j;
        int[][] map=new int [RoomSetting.size()][];
        for(i=0;i<RoomSetting.size();i++){
            for(j=0;j<RoomSetting.get(i);j++){
                map[i][j]=j+1;
            }
        }
        /*
        该函数根据RoomSetting构建一张合法的地图
        RoomSetting是教室布局，长度为列数，元素为每列行数，例如9x12的教室RoomSetting为：
        9 9 9 9 9 9 9 9 9 9 9 9
        如果参数不合法应抛出异常
    */
    }
    
    
    
    
    void SetShip(Ship userShip, BSPosition pos) throws Exception{
        
        
        
    }
    /*
        在pos处放置一艘船
        如果参数不合法应抛出异常
    */
    
    void Bomb(BSPosition pos) throws Exception;
    /*
        该函数实现：在用户点击的位置爆炸一个炸弹
        如果参数不合法应抛出异常
    */
    
    GameState getGameState();
    /*
        该函数返回当前的游戏状态，游戏状态需实现的接口见GameState
    */
    
    /*
        请补充其他对外接口
    */

    @Override
    public void SetShip(BSShip userShip, BSPosition pos) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
