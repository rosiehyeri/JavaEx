package com.javaex.exception;

import java.io.IOException;

// CheckedException : 반드시 예외 처리가 필요하다
// - try ~ catch 문으로 처리를 하거나
// - throw로 예외 던지기를 한 경우
public class ThrowsExceptEx {

	public static void main(String[] args) {
		
		ThrowsExcept except = new ThrowsExcept();
		try {
			except.divide(100, 0);
			except.executeRuntimeException();
			except.executeExcept();		// checkedException은 반드시 예외처리 해줘야한다
		} catch(IOException e) {
//			e.printStackTrace();
			System.err.println(e.getMessage());
		} catch (CustomerArithException e) {
			System.err.println(e.getMessage());
			System.err.println("나누어지는 수: " + e.getNum1());
			System.err.println("나누는 수: " + e.getNum2());
		}catch(RuntimeException e) {
			System.err.println(e.getMessage());
		}

	}

}
