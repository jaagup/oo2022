package com.company;

public class Admin extends Staff{
    Boolean userBlock;
    Boolean deleteUser;
    Boolean suspendUser;

    public Boolean getUserBlock() {
        return userBlock;
    }

    public void setUserBlock(Boolean userBlock) {
        this.userBlock = userBlock;
    }

    public Boolean getDeleteUser() {
        return deleteUser;
    }

    public void setDeleteUser(Boolean deleteUser) {
        this.deleteUser = deleteUser;
    }

    public Boolean getSuspendUser() {
        return suspendUser;
    }

    public void setSuspendUser(Boolean suspendUser) {
        this.suspendUser = suspendUser;
    }
}
