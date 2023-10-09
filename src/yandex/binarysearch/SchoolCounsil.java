package yandex.binarysearch;

/**
 * В совет школы входят родители, учителя и учащиеся,
 * причем родителей должно быть не менее одной трети от общего числа совета.
 * В настоящий момент в совет входит N человек, из них K родителей.
 * <p>
 * Определить, сколько родителей нужно дополнительно ввести в совет,
 * чтобы их число стало составлять не менее трети от общего числа членов совета?
 * https://www.youtube.com/live/YENpZexHfuk?si=rFsk_8NfYrMfBHgv&t=1326
 */
public class SchoolCounsil {

    public static void main(String[] args) {
        int counsilSize = 4;
        int parents = 0;
        System.out.println(countMinParentsAdd(counsilSize, parents));
    }
    public static int countMinParentsAdd(int counsilSize, int parentsPresent) {
        int addParents = 0;
        while (addParents < counsilSize) {
            int maybeAdd = (addParents + counsilSize) / 2;
            if ((parentsPresent + maybeAdd) * 3 >= counsilSize + maybeAdd) {
                counsilSize = maybeAdd;
            } else {
                addParents = maybeAdd + 1;
            }
        }
        return addParents;
    }
}
