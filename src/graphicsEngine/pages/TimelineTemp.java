package graphicsEngine.pages;

import graphicsEngine.GraphicsHelper;

import java.awt.*;
import java.util.Map;

import static graphicsEngine.GraphicsHelper.drawStrings_VA;

public class TimelineTemp {

    private static final Color
            fillColor = Color.gray,
            borderColor = Color.black,
            textColor = Color.black;

    /*public static void draw(Graphics g, int[] drawLocation, int[] drawSize){
        //get data from database
        Map<Integer, Year> years = Database.calendar.years;

        //calculate starting parameters for drawing
        int yearCount = years.keySet().size();
        int[] yearDrawSize = {
                drawSize[0],
                (int)Math.floor((double)drawSize[1] / yearCount)};
        int[] margin = new int[]{20, 20};

        //draw actual years
        for(int i = 0; i < yearCount; i++){
            Integer[] yearNumbers = years.keySet().toArray(new Integer[0]);
            int[] yearLocation = new int[]{
                    drawLocation[0] + margin[0],
                    drawLocation[1] + margin[1] + yearDrawSize[1] * i
            };
            drawSingleYear(g, yearLocation, new int[]{
                    yearDrawSize[0] - margin[0] * 2,
                    yearDrawSize[1] - margin[1] * 2},
                    yearNumbers[i]);
        }
    }

    private static void drawSingleYear(Graphics g, int[] drawLocation, int[] drawSize, int year){
        //background for year
        g.setColor(fillColor);
        g.fillRect(drawLocation[0], drawLocation[1], drawSize[0], drawSize[1]);

        //border for year
        g.setColor(borderColor);
        g.drawRect(drawLocation[0], drawLocation[1], drawSize[0], drawSize[1]);

        //year info
        g.setColor(textColor);
        int[] textMargin = new int[]{5, 5};
        int rowCount = drawStrings_VA(
                g, 0,
                new String[]{
                        "Year: " + year,
                        "Leap year: " + Database.calendar.years.get(year).leapYear},
                new int[]{
                        drawLocation[0] + textMargin[0],
                        drawLocation[1] + textMargin[1]});
        int textHeight = GraphicsHelper.rowsTotalHeight(rowCount) + textMargin[1] * 2;

        //draw months
        int[] monthDrawLocation = new int[]{
                drawLocation[0],
                drawLocation[1] + textHeight};
        int[] monthDrawAreaSize = new int[]{
                drawSize[0],
                Math.max(0, drawSize[1] - textHeight)};
        drawMonths(g, monthDrawLocation, monthDrawAreaSize, year);
    }

    private static void drawMonths(Graphics g, int[] drawLocation, int[] drawSize, int year){
        //top separator
        g.setColor(borderColor);
        g.drawLine(
                drawLocation[0],
                drawLocation[1],
                drawLocation[0] + drawSize[0],
                drawLocation[1]);
        //bottom separator not needed

        int monthCount = 12;
        double singleMonthWidth = (double)drawSize[0] / monthCount;

        for(int i = 0; i < monthCount; i++){
            //single month starting X
            int drawLocX = drawLocation[0] + (int)(singleMonthWidth * i);

            //vertical separator
            g.setColor(borderColor);
            g.drawLine(
                    drawLocX, drawLocation[1],
                    drawLocX, drawLocation[1] + drawSize[1]);

            //month info
            g.setColor(textColor);
            int[] textMargin = new int[]{5, 5};
            int monthNumber = i + 1;
            int rowCount = drawStrings_VA(
                    g, 0,
                    new String[]{
                            Database.calendar.years.get(year).months.get(monthNumber).getMonthName()},
                    new int[]{
                            drawLocX + textMargin[0],
                            drawLocation[1] + textMargin[1]});
            int textHeight = GraphicsHelper.rowsTotalHeight(rowCount) + textMargin[1] * 2;

            //draw days
            int[] daysDrawLocation = new int[]{
                    drawLocX,
                    drawLocation[1] + textHeight};
            int[] daysDrawAreaSize = new int[]{
                    (int)singleMonthWidth,
                    Math.max(0, drawSize[1] - textHeight)};
            drawDays(g, daysDrawLocation, daysDrawAreaSize, year, monthNumber);
        }
    }

    private static void drawDays(Graphics g, int[] drawLocation, int[] drawSize, int year, int month){
        //top separator
        g.setColor(borderColor);
        g.drawLine(
                drawLocation[0],
                drawLocation[1],
                drawLocation[0] + drawSize[0],
                drawLocation[1]);
        //bottom separator not needed

        int dayCount = Database.calendar.years.get(year).months.get(month).dayCount();
        double singleDayWidth = (double)drawSize[0] / dayCount;

        for(int i = 0; i < dayCount; i++){
            //single day starting X
            int drawLocX = drawLocation[0] + (int)(singleDayWidth * i);

            //vertical separator
            g.setColor(borderColor);
            g.drawLine(
                    drawLocX, drawLocation[1],
                    drawLocX, drawLocation[1] + drawSize[1]);

            //day info
            g.setColor(textColor);
            int[] textMargin = new int[]{5, 5};
            int dayNumber = i + 1;
            int rowCount = drawStrings_VA(
                    g, 0,
                    new String[]{Integer.toString(dayNumber)},
                    new int[]{
                            drawLocX + textMargin[0],
                            drawLocation[1] + textMargin[1]});
            int textHeight = GraphicsHelper.rowsTotalHeight(rowCount) + textMargin[1] * 2;

            //draw hours
            int[] hoursDrawLocation = new int[]{
                    drawLocX,
                    drawLocation[1] + textHeight};
            int[] hoursDrawAreaSize = new int[]{
                    (int)singleDayWidth,
                    Math.max(0, drawSize[1] - textHeight)};
            //drawHours(g, hoursDrawLocation, hoursDrawAreaSize, year, month, dayNumber);
        }
    }*/
}