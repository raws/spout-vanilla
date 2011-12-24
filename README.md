[![Spout][Project Logo]][Website]
What is MinecraftPlugin?
----------------------
Plugin for the Spout server and Spoutcraft client that provides vanilla Minecraft functionality.

Copyright &copy; 2011, SpoutDev <http://www.getspout.org>  
MinecraftPlugin is licensed under [GNU LESSER GENERAL PUBLIC LICENSE Version 3][License],
but with a provision that files are released under the MIT license
180 days after theyare published. Please see the `LICENSE.txt` file for details.

Who is SpoutDev?
----------------
SpoutDev is the team behind Spout, SpoutAPI, Spoutcraft, SpoutcraftAPI, Spoutcraft Launcher, SpoutPlugin, SpoutPluginAPI, and MinecraftPlugin.  
[![Afforess](https://secure.gravatar.com/avatar/ea0be49e1e4deac42ed9204ffd95b56c?d=mm&r=pg&s=48)](http://forums.getspout.org/members/afforess.2/) 
[![alta189](https://secure.gravatar.com/avatar/7a087430b2bf9456b8879c5469aadb95?d=mm&r=pg&s=48)](http://forums.getspout.org/members/alta189.3/) 
[![Wulfspider](https://secure.gravatar.com/avatar/6f2a0dcb60cd1ebee57875f9326bc98c?d=mm&r=pg&s=48)](http://forums.getspout.org/members/wulfspider.1/) 
[![raphfrk](https://secure.gravatar.com/avatar/68186a30d5a714f6012a9c48d2b10630?d=mm&r=pg&s=48)](http://forums.bukkit.org/members/raphfrk.294/) 
[![narrowtux](https://secure.gravatar.com/avatar/f110a5b8feacea25275521f4efd0d7f2?d=mm&r=pg&s=48)](http://forums.getspout.org/members/narrowtux.5/) 
[![Top_Cat](https://secure.gravatar.com/avatar/defeffc70d775f6df95b68f0ece46c9e?d=mm&r=pg&s=48)](http://forums.getspout.org/members/top_cat.4/) 
[![Olloth](https://secure.gravatar.com/avatar/fa8429add105b86cf3b61dbe15638812?d=mm&r=pg&s=48)](http://forums.getspout.org/members/olloth.6/) 
[![Rycochet](https://secure.gravatar.com/avatar/b06c12e72953e0edd3054a8645d76791?d=mm&r=pg&s=48)](http://forums.getspout.org/members/rycochet.10/)
[![RoyAwesome](https://secure.gravatar.com/avatar/6d258213c33a16465021daa8df299a0d?d=mm&r=pg&s=48)](http://forums.getspout.org/members/royawesome.8/)
[![zml2008](https://secure.gravatar.com/avatar/2320ab48d0715a4e9c73b7ec13fd6f3a?d=mm&r=pg&s=48)](http://forums.getspout.org/members/zml2008.14/)

Visit our [website][Website] or get support on our [forums][Forums].  
Track and submit issues and bugs on our [issue tracker][Issues].

[![Follow us on Twitter][Twitter Logo]][Twitter][![Like us on Facebook][Facebook Logo]][Facebook][![Donate to the Spout project][Donate Logo]][Donate]

Source
------
The latest and greatest source can be found on [GitHub].  
Download the latest builds from [Jenkins].  

Compiling
---------
MinecraftPlugin uses Maven to handle its dependencies.

* Install [Maven 2 or 3](http://maven.apache.org/download.html)  
* Checkout this repo and run: `mvn clean install`

Coding and Pull Request Formatting
----------------------------------
* Generally follow the Oracle coding standards.
* Use tabs, no spaces.
* No trailing whitespaces.
* No 80 column limit or midstatement newlines.
* Pull requests must compile and work.
* Pull requests must be formatted properly.
* Number of commits in a pull request should be kept to a minimum.
* No merges should be included in pull requests unless the pull request's purpose is a merge.
* If you change a packet or widget's read/write/number of bytes, be sure to increment the version on both the server and client.

**Please follow the above conventions if you want your pull request(s) accepted.**

[Project Logo]: http://cdn.getspout.org/img/logo/spout_327x150.png
[License]: http://www.gnu.org/licenses/lgpl.html
[Website]: http://www.getspout.org
[Forums]: http://forums.getspout.org
[GitHub]: https://github.com/SpoutDev/MinecraftPlugin
[Jenkins]: http://spout.in/ci
[Issues]: http://spout.in/issues
[Twitter]: http://spout.in/twitter
[Twitter Logo]: http://cdn.getspout.org/img/button/twitter_follow_us.png
[Facebook]: http://spout.in/facebook
[Facebook Logo]: http://cdn.getspout.org/img/button/facebook_like_us.png
[Donate]: https://www.paypal.com/cgi-bin/webscr?hosted_button_id=QNJH72R72TZ64&item_name=MinecraftPlugin+donation+%28from+github.com%29&cmd=_s-xclick
[Donate Logo]: http://cdn.getspout.org/img/button/donate_paypal_96x96.png