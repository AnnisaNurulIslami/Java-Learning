import java.util.Scanner;
import java.io.IOException;

public class EventTime {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
        String s_day, s_time, e_day, e_time;
        String s_split_time[], e_split_time[];
        int start_day, end_day, start_hour, end_hour, start_minute, end_minute,
                start_second, end_second, day = 0, hour = 0, minute = 0, second = 0;
        s_day = sc.nextLine();
        s_time = sc.nextLine();
        e_day = sc.nextLine();
        e_time = sc.nextLine();
        start_day = toInt(s_day);
        end_day = toInt(e_day);
        s_split_time = s_time.split(" : ");
        e_split_time = e_time.split(" : ");
        start_hour = stoInt(s_split_time[0]);
        start_minute = stoInt(s_split_time[1]);
        start_second = stoInt(s_split_time[2]);
        end_hour = stoInt(e_split_time[0]);
        end_minute = stoInt(e_split_time[1]);
        end_second = stoInt(e_split_time[2]);
        //second:
        if (end_second >= start_second) {
            second = end_second - start_second;
        } else {
            second = end_second - start_second + 60;
            end_minute = end_minute - 1;
        }
        //minute:
        if (end_minute >= start_minute) {
            minute = end_minute - start_minute;
        } else {
            minute = end_minute - start_minute + 60;
            end_hour = end_hour - 1;
        }
        //hour:
        if (end_hour >= start_hour) {
            hour = end_hour - start_hour;
        } else {
            hour = end_hour - start_hour + 24;
            end_day = end_day - 1;
        }
        //day:
        if (end_day >= start_day) {
            day = end_day - start_day;
        }
        System.out.println(day + " dia(s)");
        System.out.println(hour + " hora(s)");
        System.out.println(minute + " minuto(s)");
        System.out.println(second + " segundo(s)");
    }
    private static Integer toInt(String start_day) {
        return Integer.valueOf(start_day.substring(4).trim());
    }
    private static Integer stoInt(String start_day) {
        return Integer.valueOf(start_day.trim());
    }
		/*
		Scanner sc = new Scanner(System.in);
		String w;
		int sd, sh, sm, ss, ed, eh,em, es;
		int d = 0, h = 0, m = 0, s = 0;
		boolean hour = false, minu = false, seco = false;

		//--------------
		w = sc.next(); 
		sd = sc.nextInt();
		//--------------
		sh = sc.nextInt(); 
		w = sc.next(); 
		sm = sc.nextInt(); 
		w = sc.next(); 
		ss = sc.nextInt();
		//--------------
		w = sc.next(); 
		ed = sc.nextInt();
		//--------------
		eh = sc.nextInt(); 
		w = sc.next(); 
		em = sc.nextInt(); 
		w = sc.next(); 
		es = sc.nextInt();
		//--------------
		if (sh > eh)
			hour = true;
		if (sm > em)
			minu = true;
		if (ss > es)
			seco = true;
		while (sd != ed) {
			d++;
			sd++;
		}
		while (sh != eh) {
			h++;
			sh++;
			if (sh == 25)
				sh = 1;
		}
		while (sm != em) {
			m++;
			sm++;
			if (sm == 61)
				sm = 1;
		}
		while (ss != es) {
			s++;
			ss++;
			if (ss == 61)
				ss = 1;
		}
		if (hour == true)
			d--;
		if (minu == true)
			h--;
		if (seco == true)
			m--;

		System.out.println(d + " dia(s)");
		System.out.println(h + " hora(s)");
		System.out.println(m + " minuto(s)");
		System.out.println(s + " segundo(s)");
		*/
}