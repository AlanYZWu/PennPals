package org.cis120;

import java.util.*;

public class Channel implements Comparable<Channel> {
    private final TreeSet<String> users;
    private String name;
    private String owner;
    private boolean privacy;

    public Channel(String creator, String name) {
        this.users = new TreeSet<>();
        users.add(creator);
        this.name = name;
        this.owner = creator;
        this.privacy = false;
    }

    public Channel(String nickname, String name, boolean privacy) {
        this.users = new TreeSet<>();
        users.add(nickname);
        this.name = name;
        this.owner = nickname;
        this.privacy = privacy;
    }

    /**
     * Gets TreeSet representing all users
     *
     * @return All users in this Channel
     */
    public TreeSet<String> getUsers() {
        return this.users;
    }

    /**
     * Gets the name of the Channel
     *
     * @return Name of the Channel
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the name of the Channel owner
     *
     * @return Name of Channel owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Returns boolean corresponding to if the Channel is private or not
     *
     * @return If the Channel is private
     */
    public boolean getPrivacy() {
        return privacy;
    }

    /**
     * Sets the name of the Channel
     *
     * @param name New Name of the Channel
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the nickname of the Channel owner
     *
     * @param nickname New nickname of the Channel owner
     */
    public void setOwner(String nickname) {
        this.owner = nickname;
    }

    /**
     * Adds a user to the Channel
     *
     * @param nickname The nickname of the user to be added
     */
    public void addUser(String nickname) {
        users.add(nickname);
    }

    /**
     * Removes a user from the Channel
     *
     * @param nickname Nickname of the user to be removed
     */
    public void removeUser(String nickname) {
        users.remove(nickname);
    }

    /**
     * Checks if a user is in the Channel
     *
     * @param nickname Nickname of the user you're trying to find
     * @return boolean indicating if the user was found
     */
    public boolean contains(String nickname) {
        return users.contains(nickname);
    }

    /**
     * Compares two channels by their name
     *
     * @param channel The Channel being compared to
     * @return int representing which Channel is greater or if they're equal
     */
    @Override
    public int compareTo(Channel channel) {
        return this.name.compareTo(channel.getName());
    }
}
