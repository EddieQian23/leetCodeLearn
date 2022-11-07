package simple.dp;

public class Meeting {
        int meetId;

        public int getStartTime() {
            return startTime;
        }

        public void setStartTime(int startTime) {
            this.startTime = startTime;
        }

        int startTime;

        public int getEndTime() {
            return endTime;
        }

        public void setEndTime(int endTime) {
            this.endTime = endTime;
        }

        int endTime;

        public int getMeetId() {
            return meetId;
        }

        public void setMeetId(int meetId) {
            this.meetId = meetId;
        }
    }