module zoo.animal.talks{
    exports zoo.animal.talks.content to zoo.staff;
    exports zoo.animal.talks.media;
    exports zoo.animal.talks.schedule;

    // no longer required - requires zoo.animal.feeding;
    // no longer required - requires  zoo.animal.care;
    requires transitive zoo.animal.care;

    opens zoo.animal.talks.content to zoo.staff;
    opens zoo.animal.talks.schedule;
}