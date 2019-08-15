package com.meteorst.web;

/**
 * @Author: songtao
 * @Date: 2019/8/15 16:33
 */
public class GitTest {

    private String gitName;
    private String gitEmail;

    public String getGitName() {
        return gitName;
    }

    public void setGitName(String gitName) {
        this.gitName = gitName;
    }

    public String getGitEmail() {
        return gitEmail;
    }

    public void setGitEmail(String gitEmail) {
        this.gitEmail = gitEmail;
    }

    @Override
    public String toString() {
        return "GitTest{" +
                "gitName='" + gitName + '\'' +
                ", gitEmail='" + gitEmail + '\'' +
                '}';
    }
}
