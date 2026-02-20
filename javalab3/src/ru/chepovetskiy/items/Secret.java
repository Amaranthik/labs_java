package ru.chepovetskiy.items;

import java.util.Random;

public class Secret {
    private String keeper;
    private String text;
    private Secret next;
    private Secret prev;
    private boolean isTold = false;

    public Secret(String keeper, String text) {
        this.keeper = keeper;
        this.text = text;
    }

    public Secret(Secret source, String newKeeper) {
        if (source.isTold) {
            throw new IllegalArgumentException("Секрет уже рассказан");
        }

        System.out.println(source.keeper + " сказал что " + source.text);

        this.text = makeNoise(source.text);
        this.keeper = newKeeper;

        this.prev = source;
        source.next = this;
        source.isTold = true;
    }

    private String makeNoise(String original) {
        StringBuilder sb = new StringBuilder(original);
        Random random = new Random();
        int noiseCount = (int) (original.length() * 0.1);
        if (noiseCount == 0 && original.length() > 0) {
            noiseCount = 1;
        }

        for (int i = 0; i < noiseCount; i++) {
            int pos = random.nextInt(sb.length() + 1);
            char c = (char) ('a' + random.nextInt(26));
            sb.insert(pos, c);
        }
        return sb.toString();
    }

    public String getKeeper() {
        return keeper;
    }

    public int getQueuePosition() {
        int count = 0;
        Secret current = this;
        while (current.prev != null) {
            count++;
            current = current.prev;
        }
        return count;
    }

    public int countNextKeepers() {
        int count = 0;
        Secret current = this;
        while (current.next != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    @Override
    public String toString() {
        return keeper + ": это секрет!";
    }
}