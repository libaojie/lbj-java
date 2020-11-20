package com.lbj.c1.memory.hashset;

import java.util.Objects;

/**
 * @Classname HsEntry
 * @Description TODO
 * @Date 2020/8/4 9:14
 * @Created by libaojie
 */

public class HsEntry {
    public String name;

    @Override
    public boolean equals(Object obj) {
        HsEntry hsEntry = (HsEntry)obj;
        return this.name.equals(hsEntry.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
