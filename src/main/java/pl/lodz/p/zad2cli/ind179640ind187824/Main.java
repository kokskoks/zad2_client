package pl.lodz.p.zad2cli.ind179640ind187824;

import java.util.Scanner;

import pl.lodz.p.zad2.ind179640ind187824.CallbackInjectable;
import pl.lodz.p.zad2.ind179640ind187824.QuestionCallback;

public class Main implements Client{
	
	private QuestionCallback callback;
	
	public static void main(String... args){
		
	}

	public void setCallback(QuestionCallback callback) {
		
		this.callback = callback;
	}

	@Override
	public String[] getInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
