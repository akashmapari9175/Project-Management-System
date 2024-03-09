package com.project.exception;

import java.util.NoSuchElementException;

public class UserNotFoundException extends NoSuchElementException {

    private final long userId;

    public UserNotFoundException(long userId2) {
        super("User not found with ID: " + userId2);
        this.userId = userId2;
    }

	/*
	 * public Integer getUserId() { return userId; }
	 */

	public long getUserId() {
		// TODO Auto-generated method stub
		return userId;
	}
}