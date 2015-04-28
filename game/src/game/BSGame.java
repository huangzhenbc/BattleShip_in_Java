/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import game.BSPosition;
import game.GameState;
import java.util.ArrayList;
package game;

/**
 *
 * @author huangzhen
 */
public class BSGame implements Game<BSBlock, BSShip>{
   
    void SetMap(ArrayList<Integer> RoomSetting) throws Exception{
        
        /*
        该函数根据RoomSetting构建一张合法的地图
        RoomSetting是教室布局，长度为列数，元素为每列行数，例如9x12的教室RoomSetting为：
        9 9 9 9 9 9 9 9 9 9 9 9
        如果参数不合法应抛出异常
    */
    }
    
    
    
    
    void SetShip(Ship userShip, BSPosition pos) throws Exception;
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
}
