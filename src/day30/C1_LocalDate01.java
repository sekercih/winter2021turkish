package day30;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class C1_LocalDate01 {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date);
		System.out.println(date.getDayOfYear());
		LocalDateTime time=LocalDateTime.now();
		date.plusYears(10);
		System.out.println(date.plusYears(10));
		LocalDateTime tarih=time.plusYears(5).plusMonths(3).plusMonths(5).plusDays(12);
		System.out.println(tarih);
		System.out.println(tarih);
		
		LocalDate tarih1=LocalDate.of(1983, 03, 19);
		LocalDate tarih2=LocalDate.of(1983, 03, 02);
		System.out.println();
		System.out.println(tarih1.isAfter(tarih2));
		
		System.out.println(tarih1.getDayOfYear());
		
		LocalDate dogumgunu=LocalDate.of(1983, 03, 19);
		System.out.println(dogumgunu.getDayOfWeek());
		
		// Java'da sadece tarih kullanmak istiyorsak
        // LOcalDate Class'indan bir obje uretiriz
        
        LocalDate tarih111= LocalDate.now();
        System.out.println(tarih111); // 2021-03-19
        
        System.out.println(tarih.plusWeeks(20)); // 2021-08-06
        System.out.println(tarih.plusDays(500)); // 2022-08-01
        System.out.println(tarih.plusYears(3).plusMonths(5).plusDays(12)); //2024-08-31
        
        System.out.println(tarih.minusMonths(15));// 2019-12-19
        System.out.println(tarih.minusYears(3).minusMonths(4).minusDays(10)); // 2017-11-09
        
        System.out.println(tarih1.isLeapYear()); // false
        
        // Eger suan ki tarih ile degil de eski bir tarih ile islem yapacaksak 
        // LocalDate.of() methodunu kullaniyoruz
        LocalDate tarih11 = LocalDate.of(1995, 12, 15);
        LocalDate tarih22 = LocalDate.of(1995, 12, 10);
        
        System.out.println(tarih1.isAfter(tarih22)); // true
        System.out.println(tarih1.isBefore(tarih22)); // false
		

	}

}
