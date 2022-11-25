package de.telrun.khakov.rustam.game.hero;

import java.util.Scanner;

/**
 * @author Rustam Khakov
 */
public class ElfTest {
	public static void main(String[] args) {
		Elf elfFirst = new Elf();
		Elf elfSec = new Elf();
		elfFirst.age = 5;
		elfSec.age = 4;
		Scanner scanner = new Scanner(System.in);
		scanner.nextInt();
		System.out.println(Constant.ELF_POWER);
		System.out.println(elfFirst.age);
		System.out.println(elfSec.age);

	}
}
