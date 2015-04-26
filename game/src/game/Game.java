/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import java.util.ArrayList;

/**
 *
 * @author huangzhen
 * @param <Block>
 * @param <Ship>
 */

public interface Game<Block, Ship>
/*
    本接口是控制Game类需要实现的基本功能，可以增加额外的功能
    控制台类Game完成整个游戏流程的控制
    辅助类型Block（每个格子的必要属性）和Ship（没艘战舰的必要属性）也是必要实现的类型
    可再增加接口
*/
{
    void SetMap(ArrayList<Integer> RoomSetting) throws Exception;
    /*
        该函数根据RoomSetting构建一张合法的地图
        RoomSetting是教室布局，长度为列数，元素为每列行数，例如9x12的教室RoomSetting为：
        9 9 9 9 9 9 9 9 9 9 9 9
        如果参数不合法应抛出异常
    */
    
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
