int main()
{
    long int binarynum, octalnum = 0, j = 1, remainder,num=0,i=1;
    scanf("%ld", &binarynum);
    while (binarynum != 0)
    {
        remainder = binarynum % 10;
        octalnum = octalnum + remainder * j;
        j = j * 2;
        binarynum = binarynum / 10;
    }
while (octalnum != 0)
    {
        num += (octalnum % 8) * i;
        octalnum /= 8;
        i *= 10;
    }
printf("%d",num);
}