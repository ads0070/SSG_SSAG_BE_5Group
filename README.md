# SSG.COM ν΄λ‘ μ½λ©

## π νλ‘μ νΈ μκ°

> λ³Έ νλ‘μ νΈλ μ€νλ‘μ€ μμΉ΄λ°λ―Έ 1κΈ°μμ μ§νν **SSG.COM μ μΈκ³λͺ° ν΄λ‘  μ½λ© νλ‘μ νΈ**μλλ€.

- **μ±μΉμ±μΉ(5μ‘°)μ λ°±μλ μ μ₯μ**μλλ€.
- [Demo](https://ssg-ssag.vercel.app/)

### Project Repositories

- [νλ‘ νΈμλ](https://github.com/Im-hass/SSG_SSAG_FE)
- [λ°±μλ](https://github.com/K-J-HYEON/SSG_SSAG_BE)

### μκ΅¬μ¬ν­ λͺμΈμ
- [κ³΅ν΅](https://applebanana.atlassian.net/wiki/spaces/SPHAR/pages/2457601)

### API λͺμΈμ
- [νλ‘ νΈμλ](https://docs.google.com/spreadsheets/d/1fM01AirK6FbQDCM7PbVAU5i9HcCoMQ53Etgj0bbUIto/edit#gid=0)
- [λ°±μλ](https://docs.google.com/spreadsheets/d/1Aq4r99EeWKmvo9DBn9GqJEGnWcX8iQBx/edit#gid=990061567)

### νμ€νΈ μΌμ΄μ€
- [κ³΅ν΅](https://docs.google.com/spreadsheets/d/1L2U9AW0K4CZAcw2gEB2nxJ5lRfKHPoah/edit#gid=2076342699)

### μμ€ν μν€νμ³
![KakaoTalk_Photo_2022-09-14-22-28-05](https://user-images.githubusercontent.com/77037051/190167424-5181ad73-1d2b-487d-9d77-175b9e647498.png)

### JIRA νμ©
- [κ³΅ν΅](https://applebanana.atlassian.net/jira/software/projects/SPHAR/boards/2)


### WBS
[1_WBS.pdf](https://github.com/K-J-HYEON/SSG_SSAG_BE_5Group/files/9590848/1_WBS.pdf)


### SSG_SSAG_PPT
[SSG_SSAG_PPT.pptx](https://github.com/K-J-HYEON/SSG_SSAG_BE_5Group/files/9590846/SSG_SSAG_PPT.pptx)

&nbsp;

## π κ°λ°νκ²½

```bash
> OS : Windows 10, Mac OS, Ubuntu 20.04.4 LTS
> Infra : AWS EC2, Nginx
> DB : AWS RDS(MySQL 8.0.28)
> Storage : AWS S3
> Backend : Spring Boot 2.6.10, Gradle(λΉλ), JPA(DBμ κ·Ό)
> Api : Naver SMS API, Naver Login API, KaKao Login API
```

### μ€μΉ λ° μ€ν

1. `applicatiom.yml` νμΌμ `datasource`, `security.oauth2`, `cloud.aws`, `sms(λ€μ΄λ² SMS API)` μμ  => μ¬μ©μ κ³μ , Secret Key λ± μλ ₯

2. `SsgBeApplication.java` main ν¨μ μ€ν

&nbsp;

## π μ¬μ© κΈ°μ 

### Frontend

<img src="https://img.shields.io/badge/Vscode-23a9f2?style=flat-square&logo=visual studio code&logoColor=white"/></a>&nbsp;
<img src="https://img.shields.io/badge/React-17b6e7?style=flat-square&logo=React&logoColor=white"/></a>&nbsp;
<img src="https://img.shields.io/badge/recoil-17b6e7?style=flat-square&logo=recoil&logoColor=white"/></a>&nbsp;
<img src="https://img.shields.io/badge/SASS-CC6699?style=flat-square&logo=SASS&logoColor=white"/></a>&nbsp;
<img src="https://img.shields.io/badge/ESLint-4B32C3?style=flat-square&logo=ESLint&logoColor=white"/></a>&nbsp;
<img src="https://img.shields.io/badge/Prettier-F7B93E?style=flat-square&logo=Prettier&logoColor=white"/></a>&nbsp;

### Backend

<img src="https://img.shields.io/badge/Spring Boot-6DB33F?style=flat-square&logo=Spring Boot&logoColor=white"/></a>&nbsp;
<img src="https://img.shields.io/badge/Gradle-02303A?style=flat-square&logo=Gradle&logoColor=white"/></a>&nbsp;
<img src="https://img.shields.io/badge/JPA-0D86C1?style=flat-square&logo=JPA&logoColor=white"/></a>&nbsp;

### Deploy

<img src="https://img.shields.io/badge/Amazon EC2-FF9900?style=flat-square&logo=Amazon EC2&logoColor=white"/></a>&nbsp;
<img src="https://img.shields.io/badge/NGINX-009639?style=flat-square&logo=NGINX&logoColor=white"/></a>&nbsp;
<img src="https://img.shields.io/badge/Amazon RDS-527FFF?style=flat-square&logo=Amazon RDS&logoColor=white"/></a>&nbsp;
<img src="https://img.shields.io/badge/Amazon S3-569A31?style=flat-square&logo=Amazon S3&logoColor=white"/></a>&nbsp;


### Tools

<img src="https://img.shields.io/badge/Jira-0052CC?style=flat-square&logo=Jira&logoColor=white"/></a>&nbsp;
<img src="https://img.shields.io/badge/Github-000000?style=flat-square&logo=Github&logoColor=white"/></a>&nbsp;
<img src="https://img.shields.io/badge/Notion-fafafa?style=flat-square&logo=Notion&logoColor=black"/></a>&nbsp;

&nbsp;

## π λλ ν°λ¦¬ κ΅¬μ‘°

```bash
ββsrc
    ββmain
    β  ββjava
    β  β  ββcom
    β  β      ββssg
    β  β          ββconfig # config, security, exception, etc.. κ΄λ¦¬
    β  β          ββssg_be
    β  β          β  ββcart
    β  β          β  β  ββapplication # Service ν΄λ
    β  β          β  β  ββdomain # ν΄λΉ λλ©μΈμ entity ν΄λ
    β  β          β  β  ββdto # DTO ν΄λ
    β  β          β  β  ββinfrastructure # Repository ν΄λ
    β  β          β  β  ββpresentation # Controller ν΄λ
    β  β          β  ββ ... # λλ¨Έμ§ λλ©μΈ
    β  β          ββutils
    β  β              ββjwt
    β  β              ββoauth
    β  β              ββs3
    β  ββresources # application.yml κ΄λ¦¬
    ββtest
```
