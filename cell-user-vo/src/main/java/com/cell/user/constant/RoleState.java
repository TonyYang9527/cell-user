package com.cell.user.constant;

public enum RoleState {

	ENABLED((byte) 0), DISABLED((byte) 1);

	private byte value;

	private RoleState(byte value) {
		this.value = value;
	}

	public byte getValue() {
		return value;
	}

	public static RoleState fromValue(byte value) {
		for (RoleState flag : RoleState.values()) {
			if (flag.getValue() == value) {
				return flag;
			}
		}
		return null;
	}
}
