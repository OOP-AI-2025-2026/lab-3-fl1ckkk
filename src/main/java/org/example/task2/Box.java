package org.example.task2;

/**
 * Клас Box представляє прямокутний паралелепіпед.
 * Клас є фінальним, щоб уникнути неправильного розширення.
 */
public final class Box {

    /** Ширина коробки. */
    private final int width;

    /** Висота коробки. */
    private final int height;

    /** Глибина коробки. */
    private final int depth;

    /**
     * Конструктор створює коробку із заданими розмірами.
     *
     * @param widthParam  ширина коробки, >0.
     * @param heightParam висота коробки, >0.
     * @param depthParam  глибина коробки, >0.
     */
    public Box(final int widthParam, final int heightParam,
               final int depthParam) {
        this.width = widthParam;
        this.height = heightParam;
        this.depth = depthParam;
    }

    /**
     * Обчислює об'єм коробки.
     *
     * @return об'єм (width * height * depth).
     */
    public int getVolume() {
        return width * height * depth;
    }

    /**
     * Порівнює об'єм цієї коробки з іншою коробкою і повертає більшу.
     *
     * @param other інша коробка для порівняння.
     * @return коробка з більшим об'ємом.
     */
    public Box compare(final Box other) {
        if (this.getVolume() >= other.getVolume()) {
            return this;
        } else {
            return other;
        }
    }

    /**
     * Повертає рядкове представлення коробки.
     *
     * @return рядок з розмірами і об'ємом.
     */
    @Override
    public String toString() {
        return "Box{"
                + "width=" + width
                + ", height=" + height
                + ", depth=" + depth
                + ", volume=" + getVolume()
                + '}';
    }
}

