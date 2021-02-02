package btThuannd;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class MainTicket {
    //    0 = {TicketHistoryCustomResp@15088} "TicketHistoryCustomResp(id=4497, requestType=99, requestName=Đăng nhập, processStatus=1192, processStatusOrder=0, processName=Đang xử lý, fullName=null, email=null, phone=2362546985, jiraLink=null, customerId=0307001928, accountNo=, description=test ttttttttttttttttttttttttttttt, userId=6311093601, leadId=null, creator=null, createdDate=2020-09-11T16:02:01.074, updater=null, updatedDate=2020-09-11T16:02:01.074, interactId=direct-vn-2918, numberOfInteract=1, interactType=null, interactChannel=null, customTicketType=61)"
//    1 = {TicketHistoryCustomResp@15089} "TicketHistoryCustomResp(id=4496, requestType=99, requestName=Đăng nhập, processStatus=1192, processStatusOrder=0, processName=Đang xử lý, fullName=null, email=null, phone=2362546985, jiraLink=null, customerId=0307001928, accountNo=, description=a.aeeeeeeeeeeeeeeeeeeeeee, userId=6311093601, leadId=null, creator=null, createdDate=2020-09-11T16:02:00.311, updater=null, updatedDate=2020-09-11T16:02:00.311, interactId=direct-vn-2918, numberOfInteract=1, interactType=null, interactChannel=null, customTicketType=61)"
//    2 = {TicketHistoryCustomResp@15090} "TicketHistoryCustomResp(id=4493, requestType=99, requestName=Đăng nhập, processStatus=1192, processStatusOrder=0, processName=Đang xử lý, fullName=null, email=null, phone=2362546985, jiraLink=null, customerId=0307001928, accountNo=, description=, userId=6311093601, leadId=null, creator=null, createdDate=2020-09-11T14:13:09.231, updater=null, updatedDate=2020-09-11T14:13:09.231, interactId=direct-vn-3139, numberOfInteract=1, interactType=null, interactChannel=null, customTicketType=61)"
//    3 = {TicketHistoryCustomResp@15091} "TicketHistoryCustomResp(id=4474, requestType=66, requestName=Tài khoản phái sinh, processStatus=1193, processStatusOrder=1, processName=Chuyển bộ phận xử lý, fullName=null, email=null, phone=2362546985, jiraLink=null, customerId=0307001928, accountNo=, description=TT1, userId=6311093601, leadId=null, creator=null, createdDate=2020-09-11T08:33:39.026, updater=null, updatedDate=2020-09-11T08:57:06.116, interactId=direct-vn-3106, numberOfInteract=2, interactType=null, interactChannel=null, customTicketType=53)"
//    4 = {TicketHistoryCustomResp@15092} "TicketHistoryCustomResp(id=4474, requestType=66, requestName=Tài khoản phái sinh, processStatus=1193, processStatusOrder=1, processName=Chuyển bộ phận xử lý, fullName=null, email=null, phone=2362546985, jiraLink=null, customerId=0307001928, accountNo=, description=TT1, userId=6311093601, leadId=null, creator=null, createdDate=2020-09-11T08:33:39.026, updater=null, updatedDate=2020-09-11T08:57:06.116, interactId=direct-vn-3102, numberOfInteract=2, interactType=null, interactChannel=null, customTicketType=53)"
//    5 = {TicketHistoryCustomResp@15093} "TicketHistoryCustomResp(id=4416, requestType=99, requestName=Đăng nhập, processStatus=1193, processStatusOrder=1, processName=Chuyển bộ phận xử lý, fullName=null, email=null, phone=2362546985, jiraLink=null, customerId=0307001928, accountNo=, description=T111111111111111111, userId=6311093601, leadId=null, creator=null, createdDate=2020-09-08T17:01:29.527, updater=null, updatedDate=2020-09-11T08:47:36.606, interactId=direct-vn-3092, numberOfInteract=3, interactType=null, interactChannel=null, customTicketType=61)"
//    6 = {TicketHistoryCustomResp@15094} "TicketHistoryCustomResp(id=4416, requestType=99, requestName=Đăng nhập, processStatus=1193, processStatusOrder=1, processName=Chuyển bộ phận xử lý, fullName=null, email=null, phone=2362546985, jiraLink=null, customerId=0307001928, accountNo=, description=T111111111111111111, userId=6311093601, leadId=null, creator=null, createdDate=2020-09-08T17:01:29.527, updater=null, updatedDate=2020-09-11T08:47:36.606, interactId=direct-vn-2918, numberOfInteract=3, interactType=null, interactChannel=null, customTicketType=61)"
//    7 = {TicketHistoryCustomResp@15095} "TicketHistoryCustomResp(id=4416, requestType=99, requestName=Đăng nhập, processStatus=1193, processStatusOrder=1, processName=Chuyển bộ phận xử lý, fullName=null, email=null, phone=2362546985, jiraLink=null, customerId=0307001928, accountNo=, description=T111111111111111111, userId=6311093601, leadId=null, creator=null, createdDate=2020-09-08T17:01:29.527, updater=null, updatedDate=2020-09-11T08:47:36.606, interactId=direct-vn-2904, numberOfInteract=3, interactType=null, interactChannel=null, customTicketType=61)"
//    8 = {TicketHistoryCustomResp@15096} "TicketHistoryCustomResp(id=4475, requestType=74, requestName=Khám năng lực đầu tư, processStatus=1194, processStatusOrder=1, processName=Đã xử lý, fullName=null, email=null, phone=2362546985, jiraLink=null, customerId=0307001928, accountNo=, description=TT2, userId=6311093601, leadId=null, creator=null, createdDate=2020-09-11T08:33:57.232, updater=null, updatedDate=2020-09-11T08:33:57.232, interactId=direct-vn-3102, numberOfInteract=1, interactType=null, interactChannel=null, customTicketType=55)"
//    9 = {TicketHistoryCustomResp@15097} "TicketHistoryCustomResp(id=4467, requestType=70, requestName=Hiểu về VNDIRECT, processStatus=1192, processStatusOrder=0, processName=Đang xử lý, fullName=null, email=null, phone=2362546985, jiraLink=null, customerId=0307001928, accountNo=, description=add them dang xu ly, userId=6311093601, leadId=null, creator=null, createdDate=2020-09-10T17:54:19.625, updater=null, updatedDate=2020-09-10T17:54:19.625, interactId=direct-vn-3098, numberOfInteract=1, interactType=null, interactChannel=null, customTicketType=54)"
//    10 = {TicketHistoryCustomResp@15098} "TicketHistoryCustomResp(id=4466, requestType=66, requestName=Tài khoản phái sinh, processStatus=1192, processStatusOrder=0, processName=Đang xử lý, fullName=null, email=null, phone=2362546985, jiraLink=null, customerId=0307001928, accountNo=, description=add dang xu ly, userId=6311093601, leadId=null, creator=null, createdDate=2020-09-10T17:30:29.330, updater=null, updatedDate=2020-09-10T17:30:29.330, interactId=direct-vn-3096, numberOfInteract=1, interactType=null, interactChannel=null, customTicketType=53)"
//    11 = {TicketHistoryCustomResp@15099} "TicketHistoryCustomResp(id=4464, requestType=99, requestName=Đăng nhập, processStatus=1193, processStatusOrder=1, processName=Chuyển bộ phận xử lý, fullName=null, email=null, phone=2362546985, jiraLink=null, customerId=0307001928, accountNo=, description=ACBN, userId=6311093601, leadId=null, creator=null, createdDate=2020-09-10T17:18:52.283, updater=null, updatedDate=2020-09-10T17:18:52.283, interactId=direct-vn-3092, numberOfInteract=1, interactType=null, interactChannel=null, customTicketType=61)"
//    12 = {TicketHistoryCustomResp@15100} "TicketHistoryCustomResp(id=4456, requestType=73, requestName=Financial health check, processStatus=1197, processStatusOrder=1, processName=Khách hàng từ chối, fullName=null, email=null, phone=2362546985, jiraLink=null, customerId=0307001928, accountNo=, description=test order 1, userId=6311093601, leadId=null, creator=null, createdDate=2020-09-10T16:48:12.125, updater=null, updatedDate=2020-09-10T16:48:12.125, interactId=direct-vn-3074, numberOfInteract=1, interactType=null, interactChannel=null, customTicketType=55)"
//    13 = {TicketHistoryCustomResp@15101} "TicketHistoryCustomResp(id=4428, requestType=98, requestName=Mở tài khoản, processStatus=1194, processStatusOrder=1, processName=Đã xử lý, fullName=null, email=null, phone=2362546985, jiraLink=null, customerId=0307001928, accountNo=, description=B3 fix, userId=6311093601, leadId=null, creator=null, createdDate=2020-09-09T15:20:23.238, updater=null, updatedDate=2020-09-09T15:21:22.737, interactId=direct-vn-2948, numberOfInteract=1, interactType=null, interactChannel=null, customTicketType=61)"
//    14 = {TicketHistoryCustomResp@15102} "TicketHistoryCustomResp(id=4427, requestType=66, requestName=Tài khoản phái sinh, processStatus=1194, processStatusOrder=1, processName=Đã xử lý, fullName=null, email=null, phone=2362546985, jiraLink=null, customerId=0307001928, accountNo=, description=B2, userId=6311093601, leadId=null, creator=null, createdDate=2020-09-09T15:20:23.213, updater=null, updatedDate=2020-09-09T15:20:23.213, interactId=direct-vn-2948, numberOfInteract=1, interactType=null, interactChannel=null, customTicketType=53)"
//    15 = {TicketHistoryCustomResp@15103} "TicketHistoryCustomResp(id=4426, requestType=66, requestName=Tài khoản phái sinh, processStatus=1194, processStatusOrder=1, processName=Đã xử lý, fullName=null, email=null, phone=2362546985, jiraLink=null, customerId=0307001928, accountNo=, description=B1, userId=6311093601, leadId=null, creator=null, createdDate=2020-09-09T15:20:23.179, updater=null, updatedDate=2020-09-09T15:20:23.179, interactId=direct-vn-2948, numberOfInteract=1, interactType=null, interactChannel=null, customTicketType=53)"

    static List<Ticket> listTicket = new ArrayList<>();
    public static void main(String[] args) {
        listTicket.add(new Ticket(4497,1192, "2020-09-11T16:02:01.074"));
        listTicket.add(new Ticket(4496,1192,"2020-09-11T16:02:00.311"));
        listTicket.add(new Ticket(4493,1192,"2020-09-11T14:13:09.231"));
        listTicket.add(new Ticket(4474,1193,"2020-09-11T08:33:39.026"));
        listTicket.add(new Ticket(4416,1193,"2020-08-08T17:01:29.527"));
        listTicket.add(new Ticket(4475,1194,"2020-09-10T17:18:52.283"));
        listTicket.add(new Ticket(4467,1197,"2020-09-10T16:48:12.125"));
        listTicket.add(new Ticket(4456,1198,"2020-09-10T16:48:12.125"));
        responseArrTicket(new Ticket(1145,1194,"2020-09-16T16:48:12.125"));
        listTicket.forEach(t ->{
            System.out.println(t.toString());
        });
    }
    public static List<Ticket> responseArrTicket(Ticket t){

        List<Ticket> newListStatus = new ArrayList<>();
        List<Ticket> newListOther = new ArrayList<>();
        listTicket.add(t);
        Collections.sort(listTicket, (o1,o2)->{
            if(convertDate(o1.timeCreate).compareTo(convertDate(o2.timeCreate))>0) return -1;
            else return 1;
        });

        for (Ticket ticket:listTicket) {
            if(ticket.processStatus==1192||ticket.processStatus==1193){
                newListStatus.add(ticket);
            }else{
                newListOther.add(ticket);
            }
        }

        newListStatus.addAll(newListOther);
        return newListStatus;
    }
    public static LocalDateTime convertDate(String str){
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(str);
        return dateTime;
    }
}
