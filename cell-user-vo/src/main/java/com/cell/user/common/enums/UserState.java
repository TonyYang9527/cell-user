package com.cell.user.common.enums;

public enum UserState {
    // 草稿
    DRAFT((byte) 0),
    // 待发送
    TOBESEND((byte) 10),
    // 已发送
    SENT((byte) 30),
    // 已阅读
    READ((byte) 40),
    // 发送失败
    FAILED((byte) 99),
    // 已处理
    PROCESSED((byte) 50);

    private byte value;

    UserState(byte value) {
        this.value = value;
    }

    public byte getValue() {
        return value;
    }

    public static UserState fromValue(byte value) {
        for (UserState flag : UserState.values()) {
            if (flag.getValue() == value) {
                return flag;
            }
        }
        return null;
    }

}
