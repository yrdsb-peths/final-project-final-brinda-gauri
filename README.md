{\rtf1\ansi\ansicpg1252\cocoartf2822
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica-Bold;\f1\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
{\*\listtable{\list\listtemplateid1\listhybrid{\listlevel\levelnfc23\levelnfcn23\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{disc\}}{\leveltext\leveltemplateid1\'01\uc0\u8226 ;}{\levelnumbers;}\fi-360\li720\lin720 }{\listname ;}\listid1}
{\list\listtemplateid2\listhybrid{\listlevel\levelnfc23\levelnfcn23\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{disc\}}{\leveltext\leveltemplateid101\'01\uc0\u8226 ;}{\levelnumbers;}\fi-360\li720\lin720 }{\listname ;}\listid2}}
{\*\listoverridetable{\listoverride\listid1\listoverridecount0\ls1}{\listoverride\listid2\listoverridecount0\ls2}}
\margl1440\margr1440\vieww15400\viewh8960\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\b\fs28 \cf0 #Set up Greenfoot for VSCode
\f1\b0\fs24 \
\

\f0\b\fs26 ### [Mac]
\f1\b0\fs24 \
1. Open `Finder` and navigate to the Applications folder.\
2. Right-click on the Greenfoot app and select `Show Package Contents`.\
3. In the opened folder, go to `Contents -> Resources -> Java` and find the `greenfoot.jar` file.\
4. Copy this `greenfoot.jar` to the `/lib` Folder in this project.\

\f0\b\fs26 \
### [Windows]
\f1\b0\fs24 \
1. Open `File Explorer` and navigate to `C:\\Program Files\\Greenfoot` and locate the `greenfoot.jar` file.\
2. Copy this `greenfoot.jar` to the `\\lib` Folder in this project.\
\
\'97\
\

\f0\b\fs26 ## project.greenfoot
\f1\b0\fs24 \
Copy the `project.greenfoot.md` file and rename it to `project.greenfoot`\
\
\'97-\
\

\f0\b\fs28 # Flappy Bird - Greenfoot Edition
\f1\b0\fs24 \
Welcome to Flappy Bird, a classic game where your goal is to guide flappy through as many pipe gaps as possible without crashing!\
\
\'97-\
\

\f0\b\fs26 ## What is This Project?
\f1\b0\fs24 \
This is a Greenfoot-based recreation of the popular Flappy Bird Game. You control a flapping bird that must avoid colliding with pipes or falling to the ground. The longer you survive, the higher your score!\
\

\f0\b\fs26 ### Key Features:
\f1\b0\fs24 \
\pard\tx220\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\li720\fi-720\pardirnatural\partightenfactor0
\ls1\ilvl0\cf0 {\listtext	\uc0\u8226 	}Bird wing flapping animation\
{\listtext	\uc0\u8226 	}Increasing difficulty (pipe speed increases every 10 points)\
{\listtext	\uc0\u8226 	}Score and high score tracking\
{\listtext	\uc0\u8226 	}Sound effects for flapping and dying\
{\listtext	\uc0\u8226 	}Title screen and end screen with restart option\
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0
\cf0 \
\'97-\
\

\f0\b\fs26 ## How to Play
\f1\b0\fs24 \
\pard\tx220\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\li720\fi-720\pardirnatural\partightenfactor0
\ls2\ilvl0\cf0 \
{\listtext	\'95	}### Start the Game: \
{\listtext	\uc0\u8226 	}Press the Run button and press <space> to switch from the title screen to game world.\
\
{\listtext	\'95	}### Controls\
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0
\ls2\ilvl0\cf0 {\listtext	\uc0\u8226 	}Press <space> to flap and keep your bird in the air\
{\listtext	\uc0\u8226 	}Avoid colliding with pipes or falling to the ground.\
\pard\tx220\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\li720\fi-720\pardirnatural\partightenfactor0
\ls2\ilvl0\cf0 \
{\listtext	\'95	}### Scoring\
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0
\ls2\ilvl0\cf0 {\listtext	\uc0\u8226 	}Earn points by flying through pipe gaps.\
{\listtext	\uc0\u8226 	}Your current score is displayed in the top left.\
{\listtext	\uc0\u8226 	}High scores are saved across game sessions.\
\pard\tx220\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\li720\fi-720\pardirnatural\partightenfactor0
\ls2\ilvl0\cf0 \
{\listtext	\'95	}### Game Over\
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0
\ls2\ilvl0\cf0 {\listtext	\uc0\u8226 	}If you crash, you will be taken to the end screen showing your score and high score.\
\pard\tx220\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\li720\fi-720\pardirnatural\partightenfactor0
\ls2\ilvl0\cf0 {\listtext	\uc0\u8226 	}Press <space> again to restart the game.\
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0
\cf0 \
\

\f0\b\fs26 ## Credits
\f1\b0\fs24 \
**Background:**\
https://cdn2.steamgriddb.com/hero_thumb/0207283b7085c40e871a94a10d91fa2f.png\
\
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0
\cf0 **Pipes:**\
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0
\cf0 https://art.pixilart.com/sr29cd06c39f7aws3.png\
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0
\cf0 \ul \ulc0 \
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0
\cf0 \ulnone **Bird Animation:**\
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0
\cf0 https://img.favpng.com/18/18/18/pixel-art-flappy-bird-game-minecraft-color-png-favpng-jd5F69DAP2UZ9RqJmwSvhRXkQ.jpg\
\
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0
\cf0 **Sounds:**\
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0
\cf0 https://www.101soundboards.com/\
\
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0
\cf0 **Title Image:**\
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0
\cf0 https://www.baytekent.com/wp-content/uploads/2017/06/Flappy_Logo.png\
\
Game Over Image: \
https://content.parcelsolutions.net/42c5534b-0f47-4342-80f0-8f21203f0669/content-hub/2014/february/2014-02-gameover.jpg\
\
\

\f0\b\fs26 ## Teacher Notes:
\f1\b0\fs24 \
There is no cheat code in this game.\
\
\
\
\
\
}