package simple.dp;

import java.util.Random;

public class MeetingTest {

    public static void sortMeet(Meeting[] meetings, int n) {
        Meeting meeting = null;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {

                if (meetings[j].endTime > meetings[j + 1].endTime) {

                    meeting = meetings[j];
                    meetings[j] = meetings[j + 1];
                    meetings[j + 1] = meeting;
                }
            }
        }
    }

    public static void find(Meeting[] meetings) {

        int times = 0;
        int j = 0;
        for (int i = 0; i < meetings.length; i++) {
            if (meetings[i].startTime < meetings[j].endTime) {
                times++;
                System.out.println(meetings[i].startTime + ",end=" + meetings[i].endTime);
            } else
                j++;
        }


    }


    public static void main(String[] args) {

        Meeting[] meetings = new Meeting[4];
        Meeting meeting = new Meeting();
        meeting.setMeetId(0);
        meeting.setStartTime(1);
        meeting.setEndTime(4);
        meetings[0] = meeting;

        Meeting meeting1 = new Meeting();
        meeting1.setMeetId(1);
        meeting1.setStartTime(3);
        meeting1.setEndTime(5);
        meetings[1] = meeting1;

        Meeting meeting2 = new Meeting();
        meeting2.setMeetId(2);
        meeting2.setStartTime(5);
        meeting2.setEndTime(7);
        meetings[2] = meeting2;

        Meeting meeting3 = new Meeting();
        meeting3.setMeetId(3);
        meeting3.setStartTime(9);
        meeting3.setEndTime(12);
        meetings[3] = meeting3;

        sortMeet(meetings, 4);

        find(meetings);

        System.out.println(meetings);

    }
}
