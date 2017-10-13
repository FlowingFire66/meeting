package com.meeting.mapper;

import com.meeting.pojo.Agenda; /**
 * User: FlowingFire
 * Date: 2017/9/30 0030
 * Time: 14:59
 * Description:
 */
 
 /**Define meeting agenda record interface：AgendaMapper，
 *describe it's add,query & delete operation
 */
public interface AgendaMapper {
    boolean add(Agenda agenda);//add a meeting agenda with an example of Agenda

    Agenda findAgendaByTittle(String title);//find a meeting agenda with title(string)

    void delete(String title);//delet a meeting agenda with title(string)
}
